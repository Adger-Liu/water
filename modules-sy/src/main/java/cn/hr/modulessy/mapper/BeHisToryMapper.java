package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.BeHisTory;

public interface BeHisToryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeHisTory record);

    int insertSelective(BeHisTory record);

    BeHisTory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeHisTory record);

    int updateByPrimaryKey(BeHisTory record);
}