package cn.hr.modulessy.controller;

import cn.hr.modulessy.entity.SyEmp;
import cn.hr.modulessy.model.BeOrderModel;
import cn.hr.modulessy.service.BeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/BeOrder")
public class BeOrderController {
    @Autowired
    private BeOrderService beOrderService;

    @RequestMapping("/htmlRequest")
    public String htmlRequest(){

        return "/page/be__request";
    }
    @RequestMapping("/htmlRequest1")
    public String htmlRequest1(){

        return "/page/be__request1";
    }

    @RequestMapping("/submitRequest1")
    public String submitRequest1(BeOrderModel model, HttpSession session){
        //后台通过BeOrderModel获取数据
        System.out.println("控制层查看数据：主表的字段楼层："+model.getHouseHeight());
        for (int i=0;i<model.getUsers().size();i++){
            System.out.println("控制层查看数据：子表第"+i+"行的姓名："+model.getUsers().get(i).getUserName());
        }
        //建单人是当前登录用户，只能在控制层来获取
//        SyEmp cu=(SyEmp)session.getAttribute("currentUser");
//        model.setCreateEmp(cu.getId());
        //通过服务层把表单的所有数据保存到数据库
        //使用mybatis技术
        int rows=beOrderService.submitRequest1(model);
        if(rows>0){
            return "/page/success";
        }else{
            return "/page/error";
        }
    }







}
