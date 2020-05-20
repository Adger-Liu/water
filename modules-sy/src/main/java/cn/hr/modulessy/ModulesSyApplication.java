package cn.hr.modulessy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.hr.modulessy.mapper")
public class ModulesSyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ModulesSyApplication.class, args);
  }

}
