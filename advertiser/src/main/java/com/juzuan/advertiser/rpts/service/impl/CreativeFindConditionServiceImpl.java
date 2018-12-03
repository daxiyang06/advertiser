package com.juzuan.advertiser.rpts.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.juzuan.advertiser.rpts.mapper.CreativeFindConditionMapper;
import com.juzuan.advertiser.rpts.mapper.TaobaoAuthorizeUserMapper;
import com.juzuan.advertiser.rpts.model.CreativeFindCondition;
import com.juzuan.advertiser.rpts.model.TaobaoAuthorizeUser;
import com.juzuan.advertiser.rpts.service.CreativeFindConditionService;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.ZuanshiBannerCreativeConditionRequest;
import com.taobao.api.response.ZuanshiBannerCreativeConditionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CreativeFindConditionServiceImpl implements CreativeFindConditionService {
    private static String appkey="25139411";
    private static String url ="https://eco.taobao.com/router/rest";
    private static String secret="ccd188d30d3731df6d176ba8a2151765";
    @Autowired
    private TaobaoAuthorizeUserMapper taobaoAuthorizeUserMapper;
    @Autowired
    private CreativeFindConditionMapper creativeFindConditionMapper;

    //@Scheduled(cron = "*/5 * * * * ?")
    public String CreativeFindCondition(){
        List<TaobaoAuthorizeUser> taobaoAuthorizeUsers = taobaoAuthorizeUserMapper.selectAllToken();
        for (TaobaoAuthorizeUser tao: taobaoAuthorizeUsers) {
            TaobaoClient client = new DefaultTaobaoClient(url,appkey,secret);
            ZuanshiBannerCreativeConditionRequest req = new ZuanshiBannerCreativeConditionRequest();
            ZuanshiBannerCreativeConditionResponse rsp = null;
            try {
                rsp = client.execute(req,tao.getAccessToken());
            } catch (ApiException e){
                e.printStackTrace();
            }
            System.out.println("获取创意查询条件 : "+rsp.getBody());
            Map<String,String> map = new HashMap<>();
            //for (Object object: creativeFindConditions) {
                CreativeFindCondition cfo = new CreativeFindCondition();
                //"zuanshi_banner_creative_condition_response"
                JSONObject first = JSON.parseObject(rsp.getBody());
                JSONObject bccr = first.getJSONObject("zuanshi_banner_creative_condition_response");
                //"result"
                JSONObject second = JSON.parseObject(bccr.toString());
                JSONObject result = second.getJSONObject("result");
                //"condition"
                JSONObject third =JSON.parseObject(result.toString());
                JSONObject condition = third.getJSONObject("condition");
                //获取创意类目:creative_cat
                JSONObject fourth = JSON.parseObject(condition.toString());
                JSONObject cat = fourth.getJSONObject("creative_cat");
                //{1:\"女装\",2:\"彩妆，护肤\",3:\"女鞋\",4:\"男装\",5:\"男鞋\",6:\"箱包\",7:\"食品，茶叶，烟酒\",8:\"内衣\",9:\"保健\",10:\"饰品，服饰\",11:\"运动\",12:\"居家\",13:\"童装，母婴\",14:\"电器\",15:\"数码\",16:\"游戏\",17:\"团购\",18:\"其他\"}
                String cats = cat.toString().substring(1,150);
                String[] catl =cats.split("\\,");
                if (catl==null){
                    continue;
                }else {
                    A:
                    for (Object o : catl) {
                        //cfo = new CreativeFindCondition();
                        //String creativeCat = o.toString();
                        //cfo.setCreativeCat(creativeCat);
                        System.out.println(o.toString());

                    }
                }
                //获取创意格式:creative_format_list
                JSONObject five = fourth.getJSONObject("creative_format_list");
                JSONObject fivety = JSON.parseObject(five.toString());
                JSONArray format = fivety.getJSONArray("number");
                if (format == null){
                    continue;
                } else {
                    B:
                    for (Object ob: format.toArray()) {
                      //  cfo = new CreativeFindCondition();
                        String creativeFormatList = ob.toString();
                        cfo.setCreativeFormatList(creativeFormatList);
                        break B;
                    }
                }
                //获取创意等级编码:creative_level_list
                JSONObject six = fourth.getJSONObject("creative_level_list");
                JSONObject sixty = JSON.parseObject(six.toString());
                JSONArray level = sixty.getJSONArray("number");
                if (level == null){
                    continue;
                } else {
                    for (Object obj : level.toArray()) {
                        cfo = new CreativeFindCondition();
                        String creativeLevelList = obj.toString();

                        //creativeFindConditions.add(cfo);
                    }
                }
                //获取创意审核状态:creative_status_list
                JSONObject seven = fourth.getJSONObject("creative_status_list");
                JSONObject seventy = JSON.parseObject(seven.toString());
                JSONArray status = seventy.getJSONArray("number");
                if (status == null){
                    continue;
                } else {
                    for (Object objec : status.toArray()) {
                        cfo = new CreativeFindCondition();
                        cfo.setCreativeStatusList(objec.toString());
                        //creativeFindConditions.add(cfo);
                    }
                }
               // creativeFindConditionMapper.insert(cfo);
            //}
        }

        return "";
    }

}
