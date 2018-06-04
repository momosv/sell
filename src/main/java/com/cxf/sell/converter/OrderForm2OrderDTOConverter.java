package com.cxf.sell.converter;

import com.cxf.sell.dataobject.OrderDetail;
import com.cxf.sell.dto.OrderDTO;
import com.cxf.sell.enums.ResultEnum;
import com.cxf.sell.exception.SellException;
import com.cxf.sell.form.OrderForm;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class OrderForm2OrderDTOConverter {
    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();
        // 不用BeanUtils.copyProperties是因为OrderDTO里买家名字是BuyerName，而orderForm里是name，不一样是不能转的
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());


        // orderForm里的购物车item是字符串，但API传的是JSON格式的数据，所以要转换，转换可能出错，所以要try-ctch
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>(){}.getType());
        } catch (Exception e) {
            //log.error("【对象转换】错误，string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        // 转换没问题才设置
        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
