package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.IvInvoice;

public interface IvInvoiceMapper {
    int deleteByPrimaryKey(String invoiceNo);

    int insert(IvInvoice record);

    int insertSelective(IvInvoice record);

    IvInvoice selectByPrimaryKey(String invoiceNo);

    int updateByPrimaryKeySelective(IvInvoice record);

    int updateByPrimaryKey(IvInvoice record);
}