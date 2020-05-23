package cn.hr.modulessy.controller;

import cn.hr.modulessy.entity.UsMeter;
import cn.hr.modulessy.entity.UsUser;
import cn.hr.modulessy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *  这是用户管理的Controller
 * @Auther: Adger
 * @Date: 2020/05/20/17:56
 */
@Controller
@RequestMapping("/User")
public class UserController {
  @Autowired
  private UserService userService;
  /***
   * 这是用户查询的地址
   */
  @RequestMapping("/userSerch")
  public String userSerch(){

    return "page/user_search";
  }

  /**
   * 快捷新户的地址
   * */
  @RequestMapping("/userAdd")
  public String userAdd(UsUser usUser,UsMeter usMeter) throws ParseException {
    System.out.println("进入增加用户的方法==========");
    usUser.setUserNo("11-00001");
    System.out.println("用户编码：" + usUser.getUserNo());
    System.out.println("公户还是私户：" + usUser.getUserType());
    System.out.println("所属区域：" + usUser.getAreaId());
    System.out.println("用户姓名：" + usUser.getUserName());

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String format = simpleDateFormat.format(new Date());
    Date date = simpleDateFormat.parse(format);
    usUser.setCreateDate(date);
    System.out.println("开户时间：" + usUser.getCreateDate());

    System.out.println("收款方式：" + usUser.getPayType());
    System.out.println("联系电话：" + usUser.getPhone());
    System.out.println("开户银行：" + usUser.getBankName());
    System.out.println("银行账号：" + usUser.getBankNum());
    System.out.println("短信电话：" + usUser.getSmsPhone());
    System.out.println("合同编号：" + usUser.getContractNum());
    System.out.println("签订日期：" + usUser.getContractDate());

    System.out.println("装表日期：" + usMeter.getSetupDate());
    System.out.println("水表厂家：" + usMeter.getFactory());
    return "page/user_add";
  }

  /**
   * 快捷过户的地址
   * */
  @RequestMapping("/userChangeName")
  public String userChangeName(){
    return "page/user_changeName";
  }

  /**
   * 快捷过户的地址
   * */
  @RequestMapping("/userChangeBank")
  public String userChangeBank(){
    return "page/user_changeBank";
  }

  /**
   * 快捷换表的地址
   * */
  @RequestMapping("/userChangeMeTer")
  public String userChangeMeTer(){
    return "page/user_changeMeter";
  }

  /**
   * 快捷重签地址
   * */
    @RequestMapping("/userChangeFormula")
  public String userChangeFormula(){
    return "page/user_changeFormula";
  }

  /**
   * 快捷销户的地址
   * */
  @RequestMapping("/userDelete")
  public String userDelete(){
    return "page/user_delete";
  }

  /**
   * 快捷操作记录
   * */
  @RequestMapping("/userReportShortCut")
  public String userReportShortCut(){
    return "page/user_reportShortcut";
  }

  /**
   * 档案号管理
   * */
  @RequestMapping("/userDocNum")
  public String userDocNum(){
    return "page/user_docNum";
  }

  /**
   * 短信群发
   * */
  @RequestMapping("/userSendMsg")
  public String userSendMsg(){
    System.out.println("进入短信群发的后台方法 记录  ");

    return "page/user_sendMsg";
  }

  /***
   * 查询用户的方法
   */
  @RequestMapping("/userSerch1")
  public String userSerch1(){
    return "page/user_search1";
  }
}
