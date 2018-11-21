package com.wx.order.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.wx.order.client.GoodsClient;
import com.wx.order.dao.OrderGoodsRepository;
import com.wx.order.dao.OrderInfoRepository;
import com.wx.order.dto.OrderDTO;
import com.wx.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单service
 *
 * @author wanxiang
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderInfoRepository orderInfoRepository;
    @Autowired
    private OrderGoodsRepository orderGoodsRepository;
    @Autowired
    private GoodsClient goodsClient;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        List<Integer> ids = new ArrayList<>();
        ids.add(459);
        ids.add(460);
        JSONArray array = goodsClient.listForOrder(ids);
        System.out.println(array.toJSONString());
        return null;
    }
}
