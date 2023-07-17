package com.example.FinalProjectSpringBoot.service;

//All business logic(services) we are going to achieve with predefined methods(save(),findAll()....
//EmployeeServiceImple.java
import com.example.FinalProjectSpringBoot.entity.Cart;
import com.example.FinalProjectSpringBoot.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService{

@Autowired
private CartRepository cartRepository;

@Override
public Cart saveCart(Cart cart) {//saving records
    return cartRepository.save(cart);
}

@Override
public List<Cart> fetchAllCarts() {
    List<Cart> allCarts = cartRepository.findAll();//select the records from db table
    return allCarts;
}

@Override
public Cart getCartById(Long id) {
    Optional<Cart> cart = cartRepository.findById(id);//get the values based on customer requirement
    if (cart.isPresent()) {
        return cart.get();
    }
    return null;
}




//private LocalDateTime orderDate;
//private Double totalCost;
//private Integer totalItem;
@Override
public Cart updateCartById(Long id, Cart cart) {//based on selected id we are going to edit(Update) the record here
    Optional<Cart> cart1 = cartRepository.findById(id);

    if (cart1.isPresent()) {
    	Cart originalCart = cart1.get();

//        if (Objects.nonNull(cart.getCartName()) && !"".equalsIgnoreCase(cart.getCartName())) {
//            originalCart.setCartName(cart.getCartName());
//        }
    	if (Objects.nonNull(cart.getCartOrderDate()) && cart.getCartOrderDate() != "NULL") {
            originalCart.setCartTotalCost(cart.getCartOrderDate());
        }
        if (Objects.nonNull(cart.getCartTotalCost()) && cart.getCartTotalCost() != "NULL") {
            originalCart.setCartTotalCost(cart.getCartTotalCost());
        }
        if (Objects.nonNull(cart.getCartTotalItem()) && cart.getCartTotalItem() != "NULL") {
            originalCart.setCartTotalItem(cart.getCartTotalItem());
        }
        return cartRepository.save(originalCart);
    }
    return null;
}

@Override
public String deleteItemById(Long id) {//deleting the records from the mysql db table
    if (cartRepository.findById(id).isPresent()) {
    	cartRepository.deleteById(id);
        return "Cart deleted successfully";
    }
    return "No such Cart in the database";//table not present unable to delete the record
}
}

