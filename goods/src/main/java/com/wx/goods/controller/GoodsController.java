package com.wx.goods.controller;

import com.alibaba.fastjson.JSONArray;
import com.wx.goods.domain.Goods;
import com.wx.goods.dto.CartDTO;
import com.wx.goods.service.GoodsService;
import com.wx.goods.util.ResultUtil;
import com.wx.goods.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/list")
    public ResultVO list() {
        List<Goods> goods = goodsService.findUp(1, 10);
        return ResultUtil.success(goods);
    }

    @PostMapping("/listForOrder")
    public JSONArray listForOrder(@RequestBody List<Integer> goodsIds) {
        JSONArray array = new JSONArray();
        array.addAll(goodsService.findList(goodsIds));
        return array;
    }

    /**
     * 扣减库存（给订单服务用的）
     *
     * @param cartDTOList
     */
    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<CartDTO> cartDTOList) {
        goodsService.decreaseStock(cartDTOList);
    }

    @GetMapping("/msg")
    public String testMsg() {
        return "this is goods";
    }
}
