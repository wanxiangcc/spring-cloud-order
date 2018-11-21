package com.wx.order.controller;

import com.alibaba.fastjson.JSONObject;
import com.wx.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/create")
    public JSONObject create() {
        JSONObject object = new JSONObject();
        orderService.create(null);
        return object;
    }
}
