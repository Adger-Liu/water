package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyCostType;

public interface SyCostTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyCostType record);

    int insertSelective(SyCostType record);

    SyCostType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyCostType record);

    int updateByPrimaryKey(SyCostType record);
}