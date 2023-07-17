
package com.example.FinalProjectSpringBoot.controller;

//Controller file
//we only create the file(CartController.java)
import com.example.FinalProjectSpringBoot.entity.Cart;
import com.example.FinalProjectSpringBoot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

@Autowired
private CartService cartService;
@PostMapping("/cart")
public Cart saveCart(@RequestBody Cart cart) {
    return cartService.saveCart(cart);
}
@GetMapping("/cart")
public List<Cart> getAllCarts() {
    return cartService.fetchAllCarts();
}
@GetMapping("/cart/{id}")
public Cart getCartById(@PathVariable("id") Long id) {
    return cartService.getCartById(id);
}

@PutMapping("/cart/{id}")
public Cart updateCart(@PathVariable("id") Long id, @RequestBody Cart cart) {
    return cartService.updateCartById(id, cart);
}
@DeleteMapping("/cart/{id}")
public String deleteCart(@PathVariable("id") Long id) {
    return cartService.deleteItemById(id);
}
}
