package com.cxf.sell.service.impl;

import com.cxf.sell.dto.OrderDTO;
import com.cxf.sell.enums.ResultEnum;
import com.cxf.sell.exception.SellException;
import com.cxf.sell.service.BasicService;
import com.cxf.sell.service.BuyerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BasicService basicService;

    @Override
    public OrderDTO findOrderOne(String orderId) {
        return checkOrderOwner(orderId);
    }

    @Override
    public OrderDTO cancelOrder(String orderId) {
        OrderDTO orderDTO = checkOrderOwner( orderId);
        if (orderDTO ==  null) {
            log.error("【取消订单】查不到改订单，orderId={}", orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        return orderService.cancel(orderDTO);
    }

    private OrderDTO checkOrderOwner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        if (orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("【查询订单】订单的openid不一致，openid={}, orderDTO={}", openid, orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }
        return orderDTO;
    }
}
