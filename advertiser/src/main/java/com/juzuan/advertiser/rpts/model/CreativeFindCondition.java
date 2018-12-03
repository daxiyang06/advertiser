package com.juzuan.advertiser.rpts.model;

public class CreativeFindCondition {
    private Integer id;

    private String creativeCat;

    private String creativeFormatList;

    private Long creativeLevelList;

    private String creativeStatusList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreativeCat() {
        return creativeCat;
    }

    public void setCreativeCat(String creativeCat) {
        this.creativeCat = creativeCat == null ? null : creativeCat.trim();
    }

    public String getCreativeFormatList() {
        return creativeFormatList;
    }

    public void setCreativeFormatList(String creativeFormatList) {
        this.creativeFormatList = creativeFormatList == null ? null : creativeFormatList.trim();
    }

    public Long getCreativeLevelList() {
        return creativeLevelList;
    }

    public void setCreativeLevelList(Long creativeLevelList) {
        this.creativeLevelList = creativeLevelList;
    }

    public String getCreativeStatusList() {
        return creativeStatusList;
    }

    public void setCreativeStatusList(String creativeStatusList) {
        this.creativeStatusList = creativeStatusList == null ? null : creativeStatusList.trim();
    }
}