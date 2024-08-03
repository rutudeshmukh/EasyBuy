package com.example.EasyBuy_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EasyBuy_springboot.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
   
}

