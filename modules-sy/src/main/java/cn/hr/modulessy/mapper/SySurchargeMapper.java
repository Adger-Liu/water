package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.SySurcharge;

public interface SySurchargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SySurcharge record);

    int insertSelective(SySurcharge record);

    SySurcharge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SySurcharge record);

    int updateByPrimaryKey(SySurcharge record);
}