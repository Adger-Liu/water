package cn.hr.modulessy.service.impl;

import cn.hr.modulessy.entity.UsUser;
import cn.hr.modulessy.mapper.UsUserMapper;
import cn.hr.modulessy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/21/16:05
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
  @Autowired
  private UsUserMapper usUserMapper;
  @Override
  public int insertUser(UsUser usUser) {
    System.out.println("进入了用户增加的服务层");
    int insert = usUserMapper.insert(usUser);
    if(insert > 0){
      System.out.println("添加成功");
      return 1;
    }else{
      System.out.println("失败");
      return 0;
    }
  }
}
