package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.PyBillDetail;

public interface PyBillDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PyBillDetail record);

    int insertSelective(PyBillDetail record);

    PyBillDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PyBillDetail record);

    int updateByPrimaryKey(PyBillDetail record);
}