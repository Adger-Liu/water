package cn.hr.modulessy.service.impl;

import cn.hr.modulessy.entity.BeHisTory;
import cn.hr.modulessy.entity.BeOrder;
import cn.hr.modulessy.entity.BeOrderUser;
import cn.hr.modulessy.mapper.BeHisToryMapper;
import cn.hr.modulessy.mapper.BeOrderMapper;
import cn.hr.modulessy.mapper.BeOrderUserMapper;
import cn.hr.modulessy.model.BeOrderModel;
import cn.hr.modulessy.service.BeOrderService;
import cn.hr.modulessy.util.PrimaryGenerater;
import cn.hr.modulessy.vo.BeOrderPageVo;
import cn.hr.modulessy.vo.BeOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class BeOrderServiceImpl implements BeOrderService {
  //主表：业扩工单
  @Autowired
  private BeOrderMapper beOrderMapper;
  //子表：工单用户详表
  @Autowired
  private BeOrderUserMapper beOrderUserMapper;

  //流程历史记录
  @Autowired
  private BeHisToryMapper beHisToryMapper;

  @Override
  public int submitRequest1(BeOrderModel beOrderModel) {
    //查询已有单号，后去当前月最大的一行
    //获取当前月份   'B1-202005%'
    Date now = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
    String month = sdf.format(now);
    beOrderModel.setOrderNo("B1-" + month + "%");
    List<BeOrder> lb = beOrderMapper.query(beOrderModel);
    //第一行就是当前月最大的流水号
    String orderNo = null;
    if(lb != null && lb.size() > 0){
      BeOrder beOrder = lb.get(0);
      orderNo = beOrder.getOrderNo();
      orderNo = PrimaryGenerater.nextNumber(orderNo);
    }else{
      orderNo = PrimaryGenerater.newNumber(beOrderModel.getOrderType().toString());
    }
    // 将最新的流水号设置到 model 对象中，进行保存到数据库
    beOrderModel.setOrderNo(orderNo);
    System.out.println("流水号过长：" + beOrderModel.getOrderNo());

    //OrderNo根据业务来分配
//    String orderNo = PrimaryGenerater.newNumber("1");//第1条流程
//    beOrderModel.setOrderNo("B" + orderNo);
//    beOrderModel.setOrderType(1);//转移到页面的表单来传值固定工单类型（1新户
    beOrderModel.setStpeId(2);//当前步骤ID是2 代表初步审核
    //创建时间
    beOrderModel.setCreateDate(now);
    //1、保存主表
    int row = beOrderMapper.insertSelective(beOrderModel);
    //2、循环保存子表
    for (int i = 0; i < beOrderModel.getUsers().size(); i++) {
      BeOrderUser ou = beOrderModel.getUsers().get(i);
      //子表的所属工单，需要设置主表的主键
      ou.setOrderNo(orderNo);
      beOrderUserMapper.insertSelective(ou);
      System.out.println("服务层：子表第" + (i + 1) + "行的姓名：" + beOrderModel.getUsers().get(i).getUserName());
    }
    //3、流程历史记录
    BeHisTory beHisTory = new BeHisTory();
    beHisTory.setOrderNo(beOrderModel.getOrderNo());
    beHisTory.setStepId(beOrderModel.getStpeId());
    beHisTory.setEmpId(beOrderModel.getCreateEmp());
    int i = beHisToryMapper.insertSelective(beHisTory);
    return row;
  }

  @Override
  public List<BeOrderVo> pageList(BeOrderPageVo pagevo) {
    return  beOrderMapper.pageList(pagevo);
  }

  @Override
  public int pageTotal(BeOrderPageVo pagevo) {
    return  beOrderMapper.pageTotal(pagevo);
  }
}
