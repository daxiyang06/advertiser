package com.juzuan.advertiser.rpts.mapper;

import com.juzuan.advertiser.rpts.model.TargetCatList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TargetCatListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TargetCatList record);

    int insertSelective(TargetCatList record);

    TargetCatList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TargetCatList record);

    int updateByPrimaryKey(TargetCatList record);

    List<TargetCatList> selectAllTargetCat();
}