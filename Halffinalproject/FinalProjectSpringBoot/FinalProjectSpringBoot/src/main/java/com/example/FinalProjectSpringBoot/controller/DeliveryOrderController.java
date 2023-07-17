package com.example.FinalProjectSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.FinalProjectSpringBoot.entity.DeliveryOrder;
import com.example.FinalProjectSpringBoot.service.DeliveryOrderService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class DeliveryOrderController {
    private final DeliveryOrderService deliveryOrderService;

    @Autowired
    public DeliveryOrderController(DeliveryOrderService deliveryOrderService) {
        this.deliveryOrderService = deliveryOrderService;
    }

    @GetMapping
    public List<DeliveryOrder> getAllOrders() {
        return deliveryOrderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<DeliveryOrder> getOrderById(@PathVariable Long id) {
        return deliveryOrderService.getOrderById(id);
    }

    @PostMapping
    public DeliveryOrder createOrder(@RequestBody DeliveryOrder order) {
        return deliveryOrderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public DeliveryOrder updateOrderStatus(@PathVariable Long id, @RequestParam String status) {
        return deliveryOrderService.updateOrderStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        deliveryOrderService.deleteOrder(id);
    }
}