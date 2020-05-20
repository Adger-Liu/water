package cn.hr.modulessy.service;

import cn.hr.modulessy.entity.SyEmp;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Adger
 * @Date: 2020/05/18/11:03
 */
public interface SyEmpService {
  List<SyEmp> query(SyEmp syEmp);

  /**
   * 查询
   */
  public SyEmp getById(Integer id);

  /**
   * 登录(业务方法),支持登录业务方法
   */
  public List<SyEmp> login(SyEmp syEmp);
}
