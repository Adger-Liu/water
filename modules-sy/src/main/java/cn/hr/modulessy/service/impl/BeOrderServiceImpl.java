package cn.hr.modulessy.service.impl;

import cn.hr.modulessy.entity.BeOrder;
import cn.hr.modulessy.entity.BeOrderUser;
import cn.hr.modulessy.mapper.BeOrderMapper;
import cn.hr.modulessy.mapper.BeOrderUserMapper;
import cn.hr.modulessy.model.BeOrderModel;
import cn.hr.modulessy.service.BeOrderService;
import cn.hr.modulessy.util.PrimaryGenerater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/20/10:47
 */
@Service
@Transactional
public class BeOrderServiceImpl implements BeOrderService {

  /***
   * 主表：业务工单
   * 子表：工单用户表
   * @param beOrderModel
   * @return
   */
  @Autowired
  private BeOrderMapper beOrderMapper;
  @Autowired
  private BeOrderUserMapper beOrderUserMapper;

  /***
   * 1.保存主表
   * 2.循环保存子表
   * @param beOrderModel
   * @return
   */
  @Override
  public int submitRequest1(BeOrderModel beOrderModel) {
    String s = PrimaryGenerater.newNumber("1");
    beOrderModel.setOrderNo(s);
    beOrderModel.setOrderType(1);
    beOrderModel.setStpeId(1);
    //创建时间
    Date date = new Date();
    beOrderModel.setCreateDate(date);
    for (int i = 0;i < beOrderModel.getUsers().size();i++){
      beOrderModel.getUsers().get(i);
      beOrderMapper.insertSelective(beOrderModel.getUsers().get(i));
      System.out.println("子表第"+ i + "行" + beOrderModel.getUsers().get(i).getUserName());
    }
    return 0;
  }
}
