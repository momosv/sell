package com.cxf.sell.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "參數不正确"),

    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11, "商品库存不正确"),
    ORDER_NOT_EXIST(12, "订单不存在"),
    ORDERDETAIL_NOT_EXIST(13, "订单不存在"),
    ORDER_STATUS_ERROR(14, "订单状态不正确"),
    ORDER_UPDATE_FAIL(15, "更新异常"),
    ORDER_DETAIL_EMPTY(16, "订单详情为空"),
    ORDER_PAY_STATUS_ERROR(17, "订单支付状态不正确"),
    CART_EMPTY(18, "购物车为空"),
    ORDER_OWNER_ERROR(19, "该订单不属于当前用户"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
}
