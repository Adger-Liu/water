package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.RdTask;

public interface RdTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdTask record);

    int insertSelective(RdTask record);

    RdTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdTask record);

    int updateByPrimaryKey(RdTask record);
}