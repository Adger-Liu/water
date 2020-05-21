package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.BeOrderLite;

public interface BeOrderLiteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeOrderLite record);

    int insertSelective(BeOrderLite record);

    BeOrderLite selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeOrderLite record);

    int updateByPrimaryKey(BeOrderLite record);
}