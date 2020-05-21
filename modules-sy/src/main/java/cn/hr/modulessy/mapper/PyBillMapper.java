package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.PyBill;

public interface PyBillMapper {
    int deleteByPrimaryKey(String billNo);

    int insert(PyBill record);

    int insertSelective(PyBill record);

    PyBill selectByPrimaryKey(String billNo);

    int updateByPrimaryKeySelective(PyBill record);

    int updateByPrimaryKey(PyBill record);
}