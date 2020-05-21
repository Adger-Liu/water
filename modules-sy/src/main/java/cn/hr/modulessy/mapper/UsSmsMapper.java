package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.UsSms;

public interface UsSmsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsSms record);

    int insertSelective(UsSms record);

    UsSms selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsSms record);

    int updateByPrimaryKey(UsSms record);
}