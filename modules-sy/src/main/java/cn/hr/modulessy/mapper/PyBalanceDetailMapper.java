package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.PyBalanceDetail;

public interface PyBalanceDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PyBalanceDetail record);

    int insertSelective(PyBalanceDetail record);

    PyBalanceDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PyBalanceDetail record);

    int updateByPrimaryKey(PyBalanceDetail record);
}