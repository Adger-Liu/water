package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.RdReadTypes;

public interface RdReadTypesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdReadTypes record);

    int insertSelective(RdReadTypes record);

    RdReadTypes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdReadTypes record);

    int updateByPrimaryKey(RdReadTypes record);
}