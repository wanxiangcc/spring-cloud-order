package com.wx.order.client;

import com.alibaba.fastjson.JSONArray;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 调用客户端方法接口
 *
 * @author wanxiang
 */
@FeignClient(name = "goods")
public interface GoodsClient {
    @GetMapping(value = "/goods/msg")
    String goodsMsg();

    @PostMapping(value = "/goods/listForOrder")
    JSONArray listForOrder(List<Integer> ids);

    @PostMapping(value = "/goods/decreaseStock")
    void decreaseStock(@RequestBody JSONArray cartDTOList);
}
