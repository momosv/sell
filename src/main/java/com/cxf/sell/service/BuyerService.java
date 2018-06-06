package com.cxf.sell.service;

import com.cxf.sell.dto.OrderDTO;

public interface BuyerService {
    // 查询一个订单
    OrderDTO findOrderOne( String orderId);

    // 取消订单
    OrderDTO cancelOrder(String orderId);
}

