package com.wx.consumer.test.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * FeignClient 声明的service name
 */
@FeignClient("goods")
public interface GoodsManager {
    @GetMapping("/goods/msg")
    String msg();
}
