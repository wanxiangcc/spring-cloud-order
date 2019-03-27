package com.wx.consumer.test.ribbon;

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
    RestTemplate restTemplate;

    @RequestMapping("/msg")
    public String msg() {
        // Ribbon实现负载均衡的自动化条件：1、RestTemplate 2、Spring容器中必须有LoadBalancerClient的实现Bean
        // RibbonInterceptor方法返回了一个拦截器叫做LoadBalancerInterceptor，
        // 这个拦截器的作用主要是在客户端发起请求时对RestTemplate进行拦截，进而实现客户端负载均衡功能
        return restTemplate.getForObject("http://goods/goods/msg", String.class);
    }
}
