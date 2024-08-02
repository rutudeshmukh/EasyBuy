package com.example.EasyBuy_springboot.service;

import com.example.EasyBuy_springboot.model.CartProduct;
import com.example.EasyBuy_springboot.repository.CartProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartProductService {

    @Autowired
    private CartProductRepository cartProductRepository;

    public List<CartProduct> getAllCartProducts() {
        return cartProductRepository.findAll();
    }

    // TODO: other methods as needed
}

