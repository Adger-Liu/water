package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyArea;

public interface SyAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyArea record);

    int insertSelective(SyArea record);

    SyArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyArea record);

    int updateByPrimaryKey(SyArea record);
}