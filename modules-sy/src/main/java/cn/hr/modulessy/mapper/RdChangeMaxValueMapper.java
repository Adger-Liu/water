package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.RdChangeMaxValue;

public interface RdChangeMaxValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdChangeMaxValue record);

    int insertSelective(RdChangeMaxValue record);

    RdChangeMaxValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdChangeMaxValue record);

    int updateByPrimaryKey(RdChangeMaxValue record);
}