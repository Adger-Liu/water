package cn.hr.modulessy.controller;


import cn.hr.modulessy.entity.SyEmp;
import cn.hr.modulessy.service.SyEmpService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

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
  public String login(ModelAndView modelAndView, SyEmp syEmp,HttpSession httpSession, HttpServletRequest request){
    System.out.println("开始执行这个方法了，浏览器提交的用户名：" + syEmp.getEmpNo());
    System.out.println("开始执行这个方法了，浏览器提交的密码：" + syEmp.getPwd());
    List<SyEmp> lb = syEmpService.query(syEmp);
    if(lb.size() == 1){
      //1.成功、放入会话范围之类
      SyEmp syEmp1 = lb.get(0);
      httpSession.setAttribute("currentUser",syEmp1);
      System.out.println("进入成功此方法");
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

  /**
   * 修改密码
   * syEmpService.selectSystemUser(); 查询用户这个人 这个人呢是谁，查的是登录进来的这个人
   */
  @RequestMapping("/systemUpdatePwd")
  public String systemUpdatePwd(HttpSession session, Model model){
    //System.out.println("进入修改密码的方法");
    // 去拿到登录的用户
    SyEmp currentUser = (SyEmp) session.getAttribute("currentUser");
    //System.out.println(currentUser);
    if(currentUser != null){
      SyEmp syEmp1 = syEmpService.selectSystem(currentUser.getId());
      //System.out.println(syEmp1);
      model.addAttribute("user",syEmp1.getEmpName());
      // 定义成另一个方法 不然点击修改密码的同时还会去查
    }
    return "/page/sys_pwd";
  }




  /***
   * 查询当前密码
   */
 @RequestMapping("/currentPwd")
  public String currentPwd(String pwd,String newPwd,HttpSession session,Model model){
   //拿到当前用户是哪个的
   SyEmp currentUser = (SyEmp) session.getAttribute("currentUser");
   //当前密码 拿到这两个值 一个去比对 这个人的密码对了 就去 比对 不对 就不去 返回错误信息
  System.out.println(pwd);
  System.out.println(newPwd);
  System.out.println(currentUser.getId());
  //去查这个人传入的密码 跟数据库的密码对不对的上 对不上就没这个人
  List<SyEmp> syEmps = syEmpService.selectCurrentPwd(currentUser.getId(), pwd);
  if(currentUser.getPwd() == pwd){
    syEmpService.updatePwd(currentUser.getId(), newPwd);
  }else{
    model.addAttribute("error","密码不对头");
    return "/page/error";
  }
  return "/page/success";
}














































  /**
   * 接口测试
   */
  @RequestMapping("/testUser")
  public List<SyEmp> test(){
   List<SyEmp> syEmps = syEmpService.selectAll();
   System.out.println(syEmps);
   return syEmps;
  }
}
