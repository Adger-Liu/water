package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyEmPareaPower;

public interface SyEmPareaPowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyEmPareaPower record);

    int insertSelective(SyEmPareaPower record);

    SyEmPareaPower selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyEmPareaPower record);

    int updateByPrimaryKey(SyEmPareaPower record);
}