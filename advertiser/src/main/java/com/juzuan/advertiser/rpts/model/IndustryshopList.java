package com.juzuan.advertiser.rpts.model;

public class IndustryshopList {
    private String industryShopId;

    private String industryShopName;

    public String getIndustryShopId() {
        return industryShopId;
    }

    public void setIndustryShopId(String industryShopId) {
        this.industryShopId = industryShopId == null ? null : industryShopId.trim();
    }

    public String getIndustryShopName() {
        return industryShopName;
    }

    public void setIndustryShopName(String industryShopName) {
        this.industryShopName = industryShopName == null ? null : industryShopName.trim();
    }
}