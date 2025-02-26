package com.example.service.impl;

import com.example.mapper.DataMapper;
import com.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private DataMapper dataMapper;
    @Override
    public void updateOrderStatus(String outTradeNo) {
        String orderStatus = "已支付";
        dataMapper.updateOrderStatus(outTradeNo, orderStatus);
    }

    @Override
    public String getOrderById(long orderId) {
        return dataMapper.getOrderById(orderId);
    }
}
