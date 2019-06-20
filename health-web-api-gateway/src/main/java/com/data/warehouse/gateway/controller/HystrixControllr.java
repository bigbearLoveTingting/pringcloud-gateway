package com.data.warehouse.gateway.controller;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: 84644
 * @Date: 2019/6/20 14:02
 * @Description:
 **/
@Slf4j
@RestController
public class HystrixControllr {

    @RequestMapping("/defaultfallback")
    public Map<String,String> defaultfallback(){
        log.info("#################请求服务被熔断#################");
        Map<String, String> resMap = Maps.newHashMap();
        resMap.put("code", "500");
        resMap.put("message", "服务异常");
        return resMap;
    }
}
