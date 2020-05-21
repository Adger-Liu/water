package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.PyPay;

public interface PyPayMapper {
    int deleteByPrimaryKey(String payNo);

    int insert(PyPay record);

    int insertSelective(PyPay record);

    PyPay selectByPrimaryKey(String payNo);

    int updateByPrimaryKeySelective(PyPay record);

    int updateByPrimaryKey(PyPay record);
}