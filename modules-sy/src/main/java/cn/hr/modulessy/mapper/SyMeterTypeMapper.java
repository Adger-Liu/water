package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SyMeterType;

public interface SyMeterTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SyMeterType record);

    int insertSelective(SyMeterType record);

    SyMeterType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SyMeterType record);

    int updateByPrimaryKey(SyMeterType record);
}