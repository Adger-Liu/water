package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.BeOrder;

public interface BeOrderMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(BeOrder record);

    int insertSelective(BeOrder record);

    BeOrder selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(BeOrder record);

    int updateByPrimaryKey(BeOrder record);
}