package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyEmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 系统员工的 dao层访问接口
 * @Auther: Adger
 * @Date: 2020/05/18/10:31
 */
public interface SysEmpMapper {
  /***
   * 查询
   */
  public SyEmp getById(Integer id);

  /**
   * 登录(业务方法),支持登录业务方法
   * */
  public List<SyEmp> login(SyEmp syEmp);

}
