package cn.hr.modulessy.service;


import cn.hr.modulessy.model.BeOrderModel;
import cn.hr.modulessy.vo.BeOrderPageVo;
import cn.hr.modulessy.vo.BeOrderVo;

import java.util.List;

public interface BeOrderService {

  /***
   * 新户，申请
   */
  public int submitRequest1(BeOrderModel beOrderModel);

  /***
   * 分页查询当前页的表格数据，除了查询条件外，新增分页的条件（每页数和当前页）
   * @param pagevo
   * @return
   */
  public List<BeOrderVo> pageList(BeOrderPageVo pagevo);

  /**
   * 分页查询的总记录数
   */
  public int pageTotal(BeOrderPageVo pagevo);
}
