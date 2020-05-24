package cn.hr.modulessy.service.impl;

import cn.hr.modulessy.entity.SyEmp;
import cn.hr.modulessy.mapper.SyEmpMapper;
import cn.hr.modulessy.service.SyEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/18/11:03
 */
@Service
@Transactional
public class SyEmpServiceImpl implements SyEmpService {
  @Autowired
  private SyEmpMapper sysEmpMapper;

  @Override
  public List<SyEmp> query(SyEmp syEmp) {
    return sysEmpMapper.login(syEmp);
  }

  @Override
  public SyEmp getById(Integer id) {
    return sysEmpMapper.getById(id);
  }

  @Override
  public List<SyEmp> login(SyEmp syEmp) {
    return sysEmpMapper.login(syEmp);
  }


  /**
   * 修改密码的方法
   * @return int
   */
  @Override
  public SyEmp selectSystem(Integer id) {
    SyEmp syEmp = sysEmpMapper.selectByPrimaryKey(id);
    return syEmp;
  }

  @Override
  public List<SyEmp> selectCurrentPwd(int id,String pwd) {
    return sysEmpMapper.selectUserPwd(id,pwd);
  }

  /**
   * 修改密码
   * @param id
   * @param pwd
   */
  @Override
  public void updatePwd(int id, String pwd) {
    sysEmpMapper.updatePwd(id,pwd);
  }







  /***
   * 一个测试的方法
   * @return
   */
  @Override
  public List<SyEmp> selectAll() {
    List<SyEmp> test = sysEmpMapper.test();
    return test;
  }
}
