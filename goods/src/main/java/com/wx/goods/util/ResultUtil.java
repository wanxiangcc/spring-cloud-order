package com.wx.goods.util;

import com.wx.goods.vo.ResultVO;

/**
 * 结果工具util
 *
 * @author wanxiang
 */
public class ResultUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
