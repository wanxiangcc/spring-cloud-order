package com.wx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/msg")
    public String msg() {
        // loadBalancerClient的choose函数来负载均衡的选出一个eureka的服务实例
        ServiceInstance serviceInstance = loadBalancerClient.choose("goods");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/goods/msg";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }
}
