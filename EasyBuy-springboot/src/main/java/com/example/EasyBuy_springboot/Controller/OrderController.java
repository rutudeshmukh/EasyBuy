package com.example.EasyBuy_springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EasyBuy_springboot.model.Cart;
import com.example.EasyBuy_springboot.model.User;
import com.example.EasyBuy_springboot.service.OrderService;
import com.example.EasyBuy_springboot.service.UserService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    @Autowired
    private UserService userService;

//    @PostMapping("/create")
//    public ResponseEntity<Cart> createOrder(@RequestParam Long userId) {
//        User user = userService.findById(userId)
//            .orElseThrow(() -> new ResourceNotFoundException("User not found"));
//
//        List<Cart> cartItems = cartService.getCartItemsByUser(user);
//        Order order = orderService.createOrder(user, cartItems);
//        return new ResponseEntity<>(order, HttpStatus.CREATED);
//    }

    // TODO: Rest endpoints
}

