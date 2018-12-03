package com.juzuan.advertiser.rpts.mapper;

import com.juzuan.advertiser.rpts.model.IndustryshopList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IndustryshopListMapper {
    int deleteByPrimaryKey(String industryShopId);

    int insert(IndustryshopList record);

    int insertSelective(IndustryshopList record);

    IndustryshopList selectByPrimaryKey(String industryShopId);

    int updateByPrimaryKeySelective(IndustryshopList record);

    int updateByPrimaryKey(IndustryshopList record);
}