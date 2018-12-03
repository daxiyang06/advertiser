package com.juzuan.advertiser.rpts.mapper;

import com.juzuan.advertiser.rpts.model.CampaignRptsDayGet;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CampaignRptsDayGetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CampaignRptsDayGet record);

    int insertSelective(CampaignRptsDayGet record);

    CampaignRptsDayGet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CampaignRptsDayGet record);

    int updateByPrimaryKey(CampaignRptsDayGet record);
}