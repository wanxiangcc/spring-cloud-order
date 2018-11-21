package com.wx.goods.vo;

/**
 * 返回结果vo
 * @author wanxiang
 * @param <T>
 */
public class ResultVO<T> {
    private Integer code;
    private String msg;
    /**
     * 具体内容
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
