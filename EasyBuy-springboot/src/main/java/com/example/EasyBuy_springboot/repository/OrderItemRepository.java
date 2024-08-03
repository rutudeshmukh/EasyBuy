package com.example.EasyBuy_springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EasyBuy_springboot.model.Order;
import com.example.EasyBuy_springboot.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrder(Order order);
}

