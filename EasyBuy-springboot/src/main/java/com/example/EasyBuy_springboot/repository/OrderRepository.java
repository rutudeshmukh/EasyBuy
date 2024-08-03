package com.example.EasyBuy_springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EasyBuy_springboot.model.Order;
import com.example.EasyBuy_springboot.model.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}

