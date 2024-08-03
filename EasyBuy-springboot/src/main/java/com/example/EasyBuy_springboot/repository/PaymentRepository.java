package com.example.EasyBuy_springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EasyBuy_springboot.model.Order;
import com.example.EasyBuy_springboot.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByOrder(Order order);
}
