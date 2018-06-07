//package com.cxf.sell.controller;
//
//import com.cxf.sell.VO.ResultVO;
//
//import com.cxf.sell.converter.OrderForm2OrderDTOConverter;
//import com.cxf.sell.dataobject.OrderMaster;
//import com.cxf.sell.dto.OrderDTO;
//import com.cxf.sell.enums.ResultEnum;
//import com.cxf.sell.exception.SellException;
//import com.cxf.sell.form.OrderForm;
//import com.cxf.sell.service.BuyerService;
//import com.cxf.sell.utils.ResultVOUtils;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.util.CollectionUtils;
//import org.springframework.util.StringUtils;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/buyer/order")
//@Slf4j
//public class BuyerOrderController {
//
//    /**
//     * 4个接口：
//     * 创建订单
//     * 订单列表
//     * 订单详情
//     * 取消订单
//     */
///*
//    @Autowired
//    private OrderService orderService;*/
//
//    @Autowired
//    private BuyerService buyerService;
//
//    // 创建订单
//    public ResultVO<Map<String, String>> create(OrderMaster orderMaster, String item) {
//        // 检验一下表单提交之后有没有错误
//
//
//        Map<String, String> map = new HashMap<>();
//      //  map.put("orderId", createResult.getOrderId());
//        return ResultVOUtils.success(map);
//    }
//
//    // 订单列表
//    @GetMapping("/list")
//    public ResultVO<List<OrderDTO>> list(@RequestParam("openid") String openid, @RequestParam(value = "page", defaultValue = "0") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer size) {
//        if (StringUtils.isEmpty(openid)) {
//          //  log.error("【查询订单列表】openid为空");
//            throw new SellException(ResultEnum.PARAM_ERROR);
//        }
//        PageRequest request = new PageRequest(page, size);
//      //  Page<OrderDTO> orderDTOPage = orderService.findList(openid, request);
//        // 返回列表
//        return ResultVOUtils.success(orderDTOPage.getContent());
//    }
//
//
//    // 订单详情
//    @GetMapping("/detail")
//    public ResultVO<OrderDTO> detail(@RequestParam("openid") String openid, @RequestParam("orderid") String orderId) {
//        // OrderDTO orderDTO = orderService.findOne(orderId);
//        // Controller还是不要写这个逻辑好，而且取消订单也需要这个逻辑,所以注释掉上面这些换成下面这样
//        // if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
//        //
//        // }
//        // Controller直接控制Service，把所有逻辑都放到Service层做
//        OrderDTO orderDTO = buyerService.findOrderOne(openid, orderId);
//        return ResultVOUtils.success(orderDTO);
//    }
//
//
//    // 取消订单
//    @PostMapping("/cancel")
//    public ResultVO cancel(@RequestParam("openid") String openid, @RequestParam("orderid") String orderId) {
//        // OrderDTO orderDTO = orderService.findOne(orderId);
//        // orderService.cancel(orderDTO);
//        buyerService.cancelOrder(openid, orderId);
//        return ResultVOUtils.success();
//    }
//}
//
