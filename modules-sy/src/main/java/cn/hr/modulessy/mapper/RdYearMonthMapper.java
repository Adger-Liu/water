package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.RdYearMonth;

public interface RdYearMonthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdYearMonth record);

    int insertSelective(RdYearMonth record);

    RdYearMonth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RdYearMonth record);

    int updateByPrimaryKey(RdYearMonth record);
}