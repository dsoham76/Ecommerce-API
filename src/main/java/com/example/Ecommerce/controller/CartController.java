package com.example.Ecommerce.controller;

import com.example.Ecommerce.model.Cart;
import com.example.Ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping("cart")
    public String fillCart(@RequestBody Cart cart){
        return cartService.placeOrder(cart);
    }

    @GetMapping("cart/{cartId}")
    public Cart getCart(@PathVariable Integer cartId){
        return cartService.getCart(cartId);
    }
}
