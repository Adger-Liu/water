package cn.hr.modulessy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created with IntelliJ IDEA.
 * 设置默认访问主页面
 * @Auther: Adger
 * @Date: 2020/05/20/15:13
 */
//@Configuration
public class DefaultView extends WebMvcConfigurationSupport {
  /**
   * 添加主页方法
   * @param registry 主页注册器
   */
  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    System.out.println("设置了主页");
    //设置主页
    registry.addViewController("/").setViewName("/page/login");
    //设置优先级
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    //将主页注册器添加到视图控制器中
    super.addViewControllers(registry);
  }

}
