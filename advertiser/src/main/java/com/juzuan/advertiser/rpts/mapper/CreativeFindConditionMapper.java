package com.juzuan.advertiser.rpts.mapper;

import com.juzuan.advertiser.rpts.model.CreativeFindCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CreativeFindConditionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CreativeFindCondition record);

    int insertSelective(CreativeFindCondition record);

    CreativeFindCondition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CreativeFindCondition record);

    int updateByPrimaryKey(CreativeFindCondition record);

    List<CreativeFindCondition> selectAllCondition();
}