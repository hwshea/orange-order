package com.sfg.orange.order.web.controller;

import com.sfg.orange.order.facade.IOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
@Api(value = "订单管理", description = "订单管理")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("test")
    @ResponseBody
    @ApiOperation(value = "测试接口", notes = "测试")
    public String test() {
        orderService.test();
        return "SUCCESS";
    }
}
