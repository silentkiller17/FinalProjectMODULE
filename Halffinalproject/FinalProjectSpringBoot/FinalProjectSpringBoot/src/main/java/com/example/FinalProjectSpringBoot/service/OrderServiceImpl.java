package com.example.FinalProjectSpringBoot.service;

//All business logic(services) we are going to achieve with predefined methods(save(),findAll()....
//OrderServiceImple.java
import com.example.FinalProjectSpringBoot.entity.Order;
import com.example.FinalProjectSpringBoot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{

@Autowired
private OrderRepository orderRepository;

@Override
public Order saveOrder(Order order) {//saving records
  return orderRepository.save(order);
}

@Override
public List<Order> fetchAllOrders() {
  List<Order> allOrders = orderRepository.findAll();//select the records from db table
  return allOrders;
}

@Override
public Order getOrderById(Long id) {
  Optional<Order> order = orderRepository.findById(id);//get the values based on customer requirement
  if (order.isPresent()) {
      return order.get();
  }
  return null;
}
@Override
public Order updateOrderById(Long id, Order order) {//based on selected id we are going to edit(Update) the record here
  Optional<Order> order1 = orderRepository.findById(id);

  if (order1.isPresent()) {
	  Order originalOrder =order1.get();	  
	  
     if (Objects.nonNull(order.getMenu()) && !"".equalsIgnoreCase(order.getMenu())) {
          originalOrder.setMenu(order.getMenu());
      }
      if (Objects.nonNull(Order.getQty()) && Order.getQty() != 0) {
          originalOrder.setQty(Order.getQty());
      }
      if (Objects.nonNull(order.getCustomerName()) && !"".equalsIgnoreCase(order.getCustomerName())) {
          originalOrder.setCustomerName(order.getCustomerName());
      }
      if (Objects.nonNull(order.getAddress()) && !"".equalsIgnoreCase(order.getAddress())) {
          originalOrder.setAddress(order.getAddress());
      }
      if (Objects.nonNull(Order.getMobile()) && Order.getMobile() != 0) {
          originalOrder.setMobile(Order.getMobile());
      }
      if (Objects.nonNull(Order.getPrice()) && Order.getPrice() != 0) {
          originalOrder.setPrice(Order.getPrice());
      }
      return orderRepository.save(originalOrder);
  }
return null;
}

@Override
public String deleteOrderById(Long id) {//deleting the records from the mysql db table
  if (orderRepository.findById(id).isPresent()) {
	  orderRepository.deleteById(id);
      return "Order deleted successfully";
  }
  return "No such Order in the database";//table not present unable to delete the record
}
}
