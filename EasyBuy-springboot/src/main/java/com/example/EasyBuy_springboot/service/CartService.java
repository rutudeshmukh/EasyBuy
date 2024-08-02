package com.example.EasyBuy_springboot.service;

import com.example.EasyBuy_springboot.model.Cart;
import com.example.EasyBuy_springboot.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    // TODO: other methods as needed
}

