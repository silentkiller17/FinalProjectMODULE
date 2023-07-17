package com.example.FinalProjectSpringBoot.service;


import java.util.List;
import java.util.Optional;

import com.example.FinalProjectSpringBoot.entity.DeliveryOrder;

public interface DeliveryOrderService {
    List<DeliveryOrder> getAllOrders();

    Optional<DeliveryOrder> getOrderById(Long id);

    DeliveryOrder createOrder(DeliveryOrder order);

    DeliveryOrder updateOrderStatus(Long id, String status);

    void deleteOrder(Long id);
}
