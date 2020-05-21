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
}
