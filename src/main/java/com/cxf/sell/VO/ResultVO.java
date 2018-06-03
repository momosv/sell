package com.cxf.sell.VO;

import lombok.Data;

@Data
public class ResultVO<T> {
    // code等于0代表成功
    private Integer code;
    private String msg; // 如果希望不要返回null，返回空字符串的话，可以加上= ""
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

