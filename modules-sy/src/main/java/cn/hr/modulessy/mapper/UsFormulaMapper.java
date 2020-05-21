package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.UsFormula;

public interface UsFormulaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UsFormula record);

    int insertSelective(UsFormula record);

    UsFormula selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UsFormula record);

    int updateByPrimaryKey(UsFormula record);
}