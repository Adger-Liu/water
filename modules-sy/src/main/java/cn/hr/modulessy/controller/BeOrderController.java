package cn.hr.modulessy.controller;

import cn.hr.modulessy.entity.SyEmp;
import cn.hr.modulessy.model.BeOrderModel;
import cn.hr.modulessy.service.BeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/20/10:47
 */
@Controller
@RequestMapping("/BeOrder")
public class BeOrderController {
  @Autowired
  private BeOrderService orderService;

  /**
   * @return 用户界面
   */
  @RequestMapping("/htmlRequest")
  public String html(){
    return "page/be_request";
  }

  /**
   * @return 用户界面
   */
  @RequestMapping("/htmlRequest1")
  public String htmlRequest1(){
    return "page/be__request1";
  }

  /**
   *
   */
  @RequestMapping("/submitRequest1")
  public String submitRequest(BeOrderModel beOrderModel, HttpSession httpSession){
    // 建单人是当前登录用户，只能在控制层获取
    SyEmp currentUser = (SyEmp) httpSession.getAttribute("currentUser");
    beOrderModel.setCreateEmp(currentUser.getId());
    //后台通过BeOrderModel 获取数据
    System.out.println("控制层查看数据：主表的字段楼层:" + beOrderModel.getHouseHeight());
    for (int i = 0;i < beOrderModel.getUsers().size();i++){
      System.out.println("控制层查看数据：子表第"+ i + "行" + beOrderModel.getUsers().get(i).getUserName());
    }
    // 通过服务层把表单所有的数据保存到数据库 使用 mybatis 技术
    int i = orderService.submitRequest1(beOrderModel);
    if(i > 0){
      return "page/success";
    }else{
      return "page/error";
    }
  }
}
