package cn.hr.modulessy.mapper;

import cn.hr.modulessy.entity.BeComment;

public interface BeCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BeComment record);

    int insertSelective(BeComment record);

    BeComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BeComment record);

    int updateByPrimaryKey(BeComment record);
}