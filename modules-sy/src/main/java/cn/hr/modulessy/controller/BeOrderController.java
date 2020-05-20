package cn.hr.modulessy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/20/10:47
 */
@Controller
@RequestMapping("/BeOrder")
public class BeOrderController {

  /**
   * @return 用户界面
   */
  @RequestMapping("/htmlRequest")
  public String html(){
    return "page/be__request";
  }

  /**
   * @return 用户界面
   */
  @RequestMapping("/htmlRequest1")
  public String htmlRequest1(){
    return "page/be__request1";
  }
}
