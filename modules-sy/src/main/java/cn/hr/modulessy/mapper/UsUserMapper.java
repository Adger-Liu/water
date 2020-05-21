package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.UsUser;

public interface UsUserMapper {
    int deleteByPrimaryKey(String userNo);

    int insert(UsUser record);

    int insertSelective(UsUser record);

    UsUser selectByPrimaryKey(String userNo);

    int updateByPrimaryKeySelective(UsUser record);

    int updateByPrimaryKey(UsUser record);
}