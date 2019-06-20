package com.data.house.eureka.client.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: 84644
 * @Date: 2019/6/16 22:53
 * @Description:
 **/
@Controller
@RequestMapping("/health")
public class TestController {
    @RequestMapping("/hello1")
    @ResponseBody
    public Object hello1(){
        return "hello1";
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public Object hello2(){
        return "hello2";
    }

    @RequestMapping("/hello3")
    @ResponseBody
    public Object hello3(){
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "hello3";
    }

    @RequestMapping("/hello4")
    @ResponseBody
    public Object hello4(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "hello4";
    }

}
