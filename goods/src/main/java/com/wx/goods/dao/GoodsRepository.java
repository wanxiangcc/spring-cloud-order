package com.wx.goods.dao;

import com.wx.goods.domain.Goods;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品
 * @author wanxiang
 */
public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    /**
     * 根据商品状态查询商品List
     *
     * @param status
     * @return
     */
    List<Goods> findByIsOnSale(Integer status, Pageable pageable);

    /**
     * 根据商品Id查询商品List
     *
     * @param goodsIds
     * @return
     */
    List<Goods> findByGoodsIdIn(List<Integer> goodsIds);
}
