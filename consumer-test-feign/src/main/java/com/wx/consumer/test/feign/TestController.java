package com.wx.consumer.test.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    GoodsManager goodsManager;

    @RequestMapping("/msg")
    public String msg() {
        return goodsManager.msg();
    }
}
