package com.wx.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
// 开启服务发现功能
@EnableDiscoveryClient
// 开启Feign功能
@EnableFeignClients
@SpringBootApplication
/**
 * 订单服务
 * @author wanxiang
 */
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
