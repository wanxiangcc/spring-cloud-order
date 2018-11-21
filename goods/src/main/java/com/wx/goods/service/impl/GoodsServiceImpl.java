package com.wx.goods.service.impl;

import com.wx.goods.constants.GoodsEnum;
import com.wx.goods.dao.CategoryRepository;
import com.wx.goods.dao.GoodsRepository;
import com.wx.goods.domain.Goods;
import com.wx.goods.dto.CartDTO;
import com.wx.goods.exceptions.GoodsException;
import com.wx.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Goods> findUp(int page, int size) {
        Pageable pageable = new PageRequest(page, size);
        return goodsRepository.findByIsOnSale(GoodsEnum.StatusEnum.UP.getCode(), pageable);
    }

    @Override
    public List<Goods> findList(List<Integer> goodsIds) {
        return goodsRepository.findByGoodsIdIn(goodsIds);
    }

    @Override
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            //根据商品Id查出商品信息
            Optional<Goods> goodsOptional = goodsRepository.findById(cartDTO.getGoodsId());
            //判断商品是否存在
            if (!goodsOptional.isPresent()) {
                throw new GoodsException(GoodsEnum.ResultEnum.GOODS_NOT_EXIST);
            }
            Goods goods = goodsOptional.get();
            //判断库存是否足够
            Integer result = goods.getGoodsNumber() - cartDTO.getGoodsNumber();
            if (result < 0) {
                throw new GoodsException(GoodsEnum.ResultEnum.GOODS_STOCK_ERROR);
            }
            //扣减库存
            goods.setGoodsNumber(result);
            goodsRepository.save(goods);
        }
    }
}
