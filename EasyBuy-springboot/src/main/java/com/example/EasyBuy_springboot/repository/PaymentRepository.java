package com.example.EasyBuy_springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EasyBuy_springboot.model.Cart;
import com.example.EasyBuy_springboot.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByOrder(Cart cart);
}
