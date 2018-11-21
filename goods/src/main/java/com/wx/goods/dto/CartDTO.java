package com.wx.goods.dto;

public class CartDTO {
    private Integer goodsId;
    private Integer goodsNumber;

    public CartDTO() {
    }

    public CartDTO(Integer goodsId, Integer goodsNumber) {
        this.goodsId = goodsId;
        this.goodsNumber = goodsNumber;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
}
