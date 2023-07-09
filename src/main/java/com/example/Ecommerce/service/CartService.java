package com.example.Ecommerce.service;

import com.example.Ecommerce.model.Cart;
import com.example.Ecommerce.repository.ICartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {
    @Autowired
    ICartRepo cartRepo;

    public String placeOrder(Cart cart) {
        cartRepo.save(cart);
        return "Your order has been placed";
    }

    public Cart getCart(Integer orderId) {
        Optional<Cart> allCarts=cartRepo.findById(orderId);
        Cart cart=allCarts.get();
        if(allCarts.isPresent()){
            return cart;
        }else{
            return null;
        }
    }
}
