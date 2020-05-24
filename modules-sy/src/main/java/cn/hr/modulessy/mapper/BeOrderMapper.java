package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.BeOrder;
import cn.hr.modulessy.model.BeOrderModel;
import cn.hr.modulessy.vo.BeOrderPageVo;
import cn.hr.modulessy.vo.BeOrderVo;

import java.util.List;

public interface BeOrderMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(BeOrder record);

    int insertSelective(BeOrder record);

    BeOrder selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(BeOrder record);

    int updateByPrimaryKey(BeOrder record);

    List<BeOrder> query(BeOrderModel beOrderModel);


  //分页查询当前页的表格数据，除了查询条件外，新增分页的条件（每页数和当前页）
  public List<BeOrderVo> pageList(BeOrderPageVo pagevo);
  /**
   * 分页查询的总记录数
   */
  public int pageTotal(BeOrderPageVo pagevo);
}