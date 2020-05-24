package cn.hr.modulessy.service;

import cn.hr.modulessy.entity.SyEmp;
import org.apache.ibatis.annotations.Param;

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

  /**
   * 修改密码 需要查询有没有这个人，没有就不修改，查出来就修改
   */
  public SyEmp selectSystem(Integer id);

  List<SyEmp> selectAll();

  /**
   * 查询当前密码 有没有这个人
   * @param id
   * @param pwd
   * @return
   */
  public List<SyEmp> selectCurrentPwd(int id,String pwd);

  /**
   * 修改密码
   * @param id
   * @param pwd
   */
  public void updatePwd(int id,String pwd);
}
