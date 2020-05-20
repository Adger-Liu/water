package cn.hr.modulessy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *  这是用户管理的Controller
 * @Auther: Adger
 * @Date: 2020/05/20/17:56
 */
@Controller
@RequestMapping("/User")
public class UserController {
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
  public String userAdd(){
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
