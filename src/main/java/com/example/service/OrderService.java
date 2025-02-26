package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void updateOrderStatus(String outTradeNo);

    String getOrderById(long orderId);
}
