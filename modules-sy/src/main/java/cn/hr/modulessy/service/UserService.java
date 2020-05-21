package cn.hr.modulessy.service;

import cn.hr.modulessy.entity.UsUser;
import cn.hr.modulessy.mapper.UsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * 这是用户的服务层
 * @Auther: Adger
 * @Date: 2020/05/21/14:46
 */
public interface UserService {

  /***
   * 快捷新户
    */
  public int insertUser(UsUser usUser);
}
