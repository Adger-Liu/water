package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyEmpMenuPower;

public interface SyEmpMenuPowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyEmpMenuPower record);

    int insertSelective(SyEmpMenuPower record);

    SyEmpMenuPower selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyEmpMenuPower record);

    int updateByPrimaryKey(SyEmpMenuPower record);
}