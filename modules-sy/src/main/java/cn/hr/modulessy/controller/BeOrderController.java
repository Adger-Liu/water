package cn.hr.modulessy.controller;

import cn.hr.modulessy.model.BeOrderModel;
import cn.hr.modulessy.service.BeOrderService;
import cn.hr.modulessy.util.Page;
import cn.hr.modulessy.vo.BeOrderPageVo;
import cn.hr.modulessy.vo.BeOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/BeOrder")
public class BeOrderController {
  @Autowired
  private BeOrderService beOrderService;

  @RequestMapping("/htmlRequest")
  public String htmlRequest() {
    return "/page/be__request";
  }

  @RequestMapping("/htmlRequest1")
  public String htmlRequest1() {
    return "/page/be__request1";
  }

  /***
   * 这是初步审核的接口
   * @return /page/be__audit
   */
  @RequestMapping("/beAudit")
  public String beAudit() {
    return "/page/be__audit";
  }


  @RequestMapping("/submitRequest1")
  public String submitRequest1(BeOrderModel model, HttpSession session) {
    //后台通过BeOrderModel获取数据
    System.out.println("控制层查看数据：主表的字段楼层：" + model.getHouseHeight());
    for (int i = 0; i < model.getUsers().size(); i++) {
      System.out.println("控制层查看数据：子表第" + i + "行的姓名：" + model.getUsers().get(i).getUserName());
    }
    //建单人是当前登录用户，只能在控制层来获取
//        SyEmp cu=(SyEmp)session.getAttribute("currentUser");
//        model.setCreateEmp(cu.getId());
    //通过服务层把表单的所有数据保存到数据库
    //使用mybatis技术
    int rows = beOrderService.submitRequest1(model);
    if (rows > 0) {
      return "/page/success";
    } else {
      return "/page/error";
    }
  }


  @RequestMapping("/list")
  public String list(BeOrderPageVo pageVo, Model model) {
    //为了避免由于分页信息为空导致的空指针，当为空时赋默认的数据（默认是第一页，每页数10行）
    if (pageVo.getPage() == null) {
      pageVo.setPage(1);
    }
    if (pageVo.getSize() == null) {
      pageVo.setSize(10);
    }
    //计算开始位置=(当前页-1)*每页数
    pageVo.setStart((pageVo.getPage() - 1) * pageVo.getSize());

    //查询用户列表（分页）
    //前端页面能提供的参数：用户表的查询条件（用户名、状态）
    //以及分页的参数：当前页和每页数
    List<BeOrderVo> lb = beOrderService.pageList(pageVo);
    //查询数据库获取总记录数（满足查询条件）
    int total = beOrderService.pageTotal(pageVo);

    Page page = new Page(total, pageVo.getSize(), pageVo.getPage());
    model.addAttribute("page", page);
    model.addAttribute("lb", lb);
    return "/page/be__audit";//thymleaf页面
  }
}
