package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.IvIninvoice;

public interface IvIninvoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IvIninvoice record);

    int insertSelective(IvIninvoice record);

    IvIninvoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IvIninvoice record);

    int updateByPrimaryKey(IvIninvoice record);
}