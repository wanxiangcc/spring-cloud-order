package com.wx.consumer.test.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    GoodsManager goodsManager;

    @Value("${testKey}")
    String testKey;

    @Value("${testKey2}")
    String testKey2;

    @RequestMapping("/msg")
    public String msg() {
        return goodsManager.msg();
    }

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public String config(@RequestParam String key) {
        return key + testKey;
    }
}
