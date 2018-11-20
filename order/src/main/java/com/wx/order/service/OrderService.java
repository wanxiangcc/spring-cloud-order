package com.wx.order.service;

import com.wx.order.dto.OrderDTO;

/**
 * 订单service
 *
 * @author wanxiang
 */
public interface OrderService {
    /**
     * 创建订单
     *
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
