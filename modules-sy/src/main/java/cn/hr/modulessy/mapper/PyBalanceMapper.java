package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.PyBalance;

public interface PyBalanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PyBalance record);

    int insertSelective(PyBalance record);

    PyBalance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PyBalance record);

    int updateByPrimaryKey(PyBalance record);
}