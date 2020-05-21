package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyMenu;

public interface SyMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyMenu record);

    int insertSelective(SyMenu record);

    SyMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyMenu record);

    int updateByPrimaryKey(SyMenu record);
}