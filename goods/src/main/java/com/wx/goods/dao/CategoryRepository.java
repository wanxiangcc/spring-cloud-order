package com.wx.goods.dao;

import com.wx.goods.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * category
 * @author wanxiang
 */
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
