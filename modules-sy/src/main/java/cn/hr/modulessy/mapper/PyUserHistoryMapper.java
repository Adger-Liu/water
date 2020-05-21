package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.PyUserHistory;

public interface PyUserHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PyUserHistory record);

    int insertSelective(PyUserHistory record);

    PyUserHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PyUserHistory record);

    int updateByPrimaryKey(PyUserHistory record);
}