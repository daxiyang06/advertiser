package com.juzuan.advertiser.rpts.service;

import com.juzuan.advertiser.rpts.model.TaobaoAuthorizeUser;

public interface TaobaoAuthorizeUserService {
    int deleteByPrimaryKey(Long id);

    int insert(TaobaoAuthorizeUser record);

    int insertSelective(TaobaoAuthorizeUser record);

    TaobaoAuthorizeUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaobaoAuthorizeUser record);

    int updateByPrimaryKey(TaobaoAuthorizeUser record);
}
