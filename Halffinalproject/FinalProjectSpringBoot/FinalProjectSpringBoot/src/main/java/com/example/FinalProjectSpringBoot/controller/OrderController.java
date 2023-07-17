
package com.example.FinalProjectSpringBoot.controller;

//Controller file
//we only create the file(OrderController.java)
import com.example.FinalProjectSpringBoot.entity.Order;
import com.example.FinalProjectSpringBoot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController  {

@Autowired
private OrderService orderService;
@PostMapping("/order")
public Order saveOrder(@RequestBody Order order) {
return orderService.saveOrder(order);
}
@GetMapping("/order")
public List<Order> getAllOrders() {
return orderService.fetchAllOrders();
}
@GetMapping("/order/{id}")
public Order getOrderById(@PathVariable("id") Long id) {
return orderService.getOrderById(id);
}

@PutMapping("/order/{id}")
public Order updateOrder(@PathVariable("id") Long id, @RequestBody Order order) {
return orderService.updateOrderById(id, order);
}
@DeleteMapping("/order/{id}")
public String deleteOrder(@PathVariable("id") Long id) {
return orderService.deleteOrderById(id);
}
}
