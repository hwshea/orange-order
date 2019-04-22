package com.sfg.orange.order.web.service;

import com.sfg.orange.order.facade.IOrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Override
    public void test() {
        System.out.println("hehe");
    }
}
