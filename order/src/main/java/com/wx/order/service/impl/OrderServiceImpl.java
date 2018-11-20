package com.wx.order.service.impl;

import com.wx.order.dao.OrderGoodsRepository;
import com.wx.order.dao.OrderInfoRepository;
import com.wx.order.dto.OrderDTO;
import com.wx.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单service
 * @author wanxiang
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderInfoRepository orderInfoRepository;
    @Autowired
    private OrderGoodsRepository orderGoodsRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        return null;
    }
}
