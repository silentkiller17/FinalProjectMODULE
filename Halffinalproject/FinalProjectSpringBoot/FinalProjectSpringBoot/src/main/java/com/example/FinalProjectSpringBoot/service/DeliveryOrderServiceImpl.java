package com.example.FinalProjectSpringBoot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalProjectSpringBoot.entity.DeliveryOrder;
import com.example.FinalProjectSpringBoot.repository.DeliveryOrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryOrderServiceImpl implements DeliveryOrderService {
  private final DeliveryOrderRepository deliveryOrderRepository;

  @Autowired
  public DeliveryOrderServiceImpl(DeliveryOrderRepository deliveryOrderRepository) {
      this.deliveryOrderRepository = deliveryOrderRepository;
  }

  @Override
  public List<DeliveryOrder> getAllOrders() {
      return deliveryOrderRepository.findAll();
  }

  @Override
  public Optional<DeliveryOrder> getOrderById(Long id) {
      return deliveryOrderRepository.findById(id);
  }

  @Override
  public DeliveryOrder createOrder(DeliveryOrder order) {
      return deliveryOrderRepository.save(order);
  }

  @Override
  public DeliveryOrder updateOrderStatus(Long id, String status) {
      Optional<DeliveryOrder> optionalOrder = deliveryOrderRepository.findById(id);
      if (optionalOrder.isPresent()) {
          DeliveryOrder order = optionalOrder.get();
          order.setStatus(status);
                    
          return deliveryOrderRepository.save(order);
      }
      return null;
  }

  @Override
  public void deleteOrder(Long id) {
      deliveryOrderRepository.deleteById(id);
  }
}
