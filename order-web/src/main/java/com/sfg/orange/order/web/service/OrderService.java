package com.sfg.orange.order.web.service;

import com.sfg.orange.order.dao.entity.Order;
import com.sfg.orange.order.dao.mapper.OrderMapper;
import com.sfg.orange.order.facade.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void test() {
        String orderNo = orderMapper.selectOrderNoById(1L);
        //Order order = new Order();
        //orderMapper.selectOne(order);
        System.out.println("hehe:" + orderNo);
    }
}
