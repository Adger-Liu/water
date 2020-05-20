package cn.hr.modulessy.controller;

import cn.hr.modulessy.entity.SyEmp;
import cn.hr.modulessy.service.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/18/11:24
 */
@Controller
@RequestMapping("/SyEmp")
public class SyEmpController {

 @Autowired
  private SyEmpService syEmpService;

  /**
   * 找到登录界面
   * */
  @RequestMapping("/htmlLogin")
  public String htmlLogin(){
    return "page/login";
  }

  /**
   * 登录验证
   * */
  @RequestMapping("/login")
  public String login(ModelAndView modelAndView, SyEmp syEmp,
                      HttpSession httpSession, HttpServletRequest request){
    System.out.println("开始执行这个方法了，浏览器提交的用户名：" + syEmp.getEmpNo());
    System.out.println("开始执行这个方法了，浏览器提交的密码：" + syEmp.getPwd());
    List<SyEmp> lb = syEmpService.query(syEmp);
    if(lb.size() == 1){
      //1.成功、放入会话范围之类
      SyEmp syEmp1 = lb.get(0);
      httpSession.setAttribute("currentUser",syEmp);
      System.out.println("进入此方法");
      return "/page/workspace";
    }else{
      //2.失败 跳转登录界面
      System.out.println("进入失败方法");
      /*
       * session的会话比request大
       */
      //httpSession.setAttribute("error","用户名密码错误或者无此用户");
      request.setAttribute("error","用户名密码错误或者无此用户");
      return this.htmlLogin();
    }
  }
}
