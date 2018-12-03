package com.juzuan.advertiser.rpts.service.impl;

import com.juzuan.advertiser.rpts.mapper.TaobaoAuthorizeUserMapper;
import com.juzuan.advertiser.rpts.model.TaobaoAuthorizeUser;
import com.juzuan.advertiser.rpts.service.TaobaoAuthorizeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaobaoAuthorizeUserServiceImpl implements TaobaoAuthorizeUserService {
    @Autowired
    private TaobaoAuthorizeUserMapper taobaoAuthorizeUserMapper;
    @Override

    public TaobaoAuthorizeUser selectByPrimaryKey(Long id) {
        return taobaoAuthorizeUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(TaobaoAuthorizeUser record) {
        return 0;
    }

    @Override
    public int insertSelective(TaobaoAuthorizeUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(TaobaoAuthorizeUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TaobaoAuthorizeUser record) {
        return 0;
    }
}
