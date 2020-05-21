package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.BeOrderUser;

public interface BeOrderUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeOrderUser record);

    int insertSelective(BeOrderUser record);

    BeOrderUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeOrderUser record);

    int updateByPrimaryKey(BeOrderUser record);
}