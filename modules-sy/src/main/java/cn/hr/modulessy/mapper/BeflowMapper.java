package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.Beflow;

public interface BeflowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Beflow record);

    int insertSelective(Beflow record);

    Beflow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Beflow record);

    int updateByPrimaryKey(Beflow record);
}