package com.wx.goods.service;

import com.wx.goods.domain.Goods;
import com.wx.goods.dto.CartDTO;

import java.util.List;

public interface GoodsService {
    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    List<Goods> findUp(int page, int size);

    /**
     * 根据idList查询商品列表
     *
     * @param goodsIds
     * @return
     */
    List<Goods> findList(List<Integer> goodsIds);

    /**
     * 扣库存
     *
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
