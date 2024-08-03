package com.example.EasyBuy_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EasyBuy_springboot.repository.OrderItemRepository;
import com.example.EasyBuy_springboot.repository.OrderRepository;


@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;


	public Object findById(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

    // Other business methods
}

