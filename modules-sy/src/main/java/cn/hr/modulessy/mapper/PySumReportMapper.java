package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.PySumReport;

public interface PySumReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PySumReport record);

    int insertSelective(PySumReport record);

    PySumReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PySumReport record);

    int updateByPrimaryKey(PySumReport record);
}