package com.example.EasyBuy_springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EasyBuy_springboot.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

