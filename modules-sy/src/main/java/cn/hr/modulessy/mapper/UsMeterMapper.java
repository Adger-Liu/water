package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.UsMeter;

public interface UsMeterMapper {
    int deleteByPrimaryKey(String meterNo);

    int insert(UsMeter record);

    int insertSelective(UsMeter record);

    UsMeter selectByPrimaryKey(String meterNo);

    int updateByPrimaryKeySelective(UsMeter record);

    int updateByPrimaryKey(UsMeter record);
}