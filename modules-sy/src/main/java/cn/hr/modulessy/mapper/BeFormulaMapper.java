package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.BeFormula;

public interface BeFormulaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeFormula record);

    int insertSelective(BeFormula record);

    BeFormula selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeFormula record);

    int updateByPrimaryKey(BeFormula record);
}