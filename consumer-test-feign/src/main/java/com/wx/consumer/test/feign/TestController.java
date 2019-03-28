package com.wx.consumer.test.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    GoodsManager goodsManager;

    @Value("${testKey}")
    String configName;

    @RequestMapping("/msg")
    public String msg() {
        return goodsManager.msg();
    }

    @RequestMapping("/config")
    public String config() {
        return configName;
    }
}
