package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyDept;

public interface SyDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyDept record);

    int insertSelective(SyDept record);

    SyDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyDept record);

    int updateByPrimaryKey(SyDept record);
}