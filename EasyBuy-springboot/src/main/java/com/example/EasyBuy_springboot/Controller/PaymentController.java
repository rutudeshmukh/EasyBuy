package com.example.EasyBuy_springboot.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EasyBuy_springboot.model.Cart;
import com.example.EasyBuy_springboot.model.Payment;
import com.example.EasyBuy_springboot.service.OrderService;
import com.example.EasyBuy_springboot.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    
    @Autowired
    private OrderService orderService;
    
    @PostMapping("/process")
    public ResponseEntity<Payment> processPayment(@RequestParam Long orderId,
                                                   @RequestParam BigDecimal amount,
                                                   @RequestParam String paymentMethod) {
    	//TODO
//        Order order = orderService.findById(orderId)
//            .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
//
//        Payment payment = paymentService.processPayment(order, amount, paymentMethod);
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
    }

    // TODO: Other endpoints
}
