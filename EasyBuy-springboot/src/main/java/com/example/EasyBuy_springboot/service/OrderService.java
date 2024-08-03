package com.example.EasyBuy_springboot.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EasyBuy_springboot.model.Cart;
import com.example.EasyBuy_springboot.model.Order;
import com.example.EasyBuy_springboot.model.User;
import com.example.EasyBuy_springboot.repository.OrderItemRepository;
import com.example.EasyBuy_springboot.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Transactional
    public Order createOrder(User user, List<Cart> cartItems) {
    	//TODO:
        Order order = new Order();
//        order.setUser(user);
//        order.setStatus(OrderStatus.PENDING);
//        order.setTotalPrice(calculateTotalPrice(cartItems));
//        order.setShippingAddress(user.getAddress());
//
//        for (CartItem cartItem : cartItems) {
//            OrderItem orderItem = new OrderItem();
//            orderItem.setOrder(order);
//            orderItem.setProduct(cartItem.getProduct());
//            orderItem.setQuantity(cartItem.getQuantity());
//            orderItem.setPrice(cartItem.getProduct().getPrice());
//            order.getOrderItems().add(orderItem);
//        }

        return orderRepository.save(order);
    }

//    private BigDecimal calculateTotalPrice(List<CartItem> cartItems) {
//        return cartItems.stream()
//            .map(cartItem -> cartItem.getProduct().getPrice().multiply(new BigDecimal(cartItem.getQuantity())))
//            .reduce(BigDecimal.ZERO, BigDecimal::add);
//    }

	public Object findById(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

    // Other business methods
}

