package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyEmp;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 系统员工的 dao层访问接口
 * @Auther: Adger
 * @Date: 2020/05/18/10:31
 */
public interface SyEmpMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyEmp record);

    int insertSelective(SyEmp record);

    SyEmp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyEmp record);

    int updateByPrimaryKey(SyEmp record);

    /***
     * 查询
     */
    public SyEmp getById(Integer id);

    /**
     * 登录(业务方法),支持登录业务方法
     * */
    public List<SyEmp> login(SyEmp syEmp);
}