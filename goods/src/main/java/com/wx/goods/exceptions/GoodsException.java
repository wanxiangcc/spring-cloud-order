package com.wx.goods.exceptions;
import com.wx.goods.constants.GoodsEnum;
/**
 * 异常
 *
 * @author wanxiang
 */
public class GoodsException extends RuntimeException {
    private Integer code;

    public GoodsException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public GoodsException(GoodsEnum.ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
