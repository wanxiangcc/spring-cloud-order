package com.wx.goods.constants;

public class GoodsEnum {
    public enum StatusEnum {
        UP(0, "在架"),
        DOWN(1, "下架");
        private Integer code;
        private String message;

        StatusEnum(Integer code, String message) {
            this.code = code;
            this.message = message;
        }

        public Integer getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }

    public enum ResultEnum {
        GOODS_NOT_EXIST(1, "商品不存在"),
        GOODS_STOCK_ERROR(1, "库存有误");
        private Integer code;
        private String message;

        ResultEnum(Integer code, String message) {
            this.code = code;
            this.message = message;
        }

        public Integer getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}
