package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.IvArchive;

public interface IvArchiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IvArchive record);

    int insertSelective(IvArchive record);

    IvArchive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IvArchive record);

    int updateByPrimaryKey(IvArchive record);
}