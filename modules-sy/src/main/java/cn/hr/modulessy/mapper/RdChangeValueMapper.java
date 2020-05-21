package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.RdChangeValue;

public interface RdChangeValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdChangeValue record);

    int insertSelective(RdChangeValue record);

    RdChangeValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdChangeValue record);

    int updateByPrimaryKey(RdChangeValue record);
}