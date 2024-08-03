//package com.example.EasyBuy_springboot.Controller;
//
//import java.math.BigDecimal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.EasyBuy_springboot.model.Cart;
//import com.example.EasyBuy_springboot.model.Payment;
//import com.example.EasyBuy_springboot.service.OrderService;
//import com.example.EasyBuy_springboot.service.PaymentService;
//
//@RestController
//@RequestMapping("/payments")
//public class PaymentController {
//    @Autowired
//    private PaymentService paymentService;
//    
//    @Autowired
//    private OrderService orderService;
//    
//    @PostMapping("/process")
//    public ResponseEntity<Payment> processPayment(@RequestParam Long orderId,
//                                                   @RequestParam BigDecimal amount,
//                                                   @RequestParam String paymentMethod) {
//    	//TODO
////        Order order = orderService.findById(orderId)
////            .orElseThrow(() -> new ResourceNotFoundException("Order not found"));
////
////        Payment payment = paymentService.processPayment(order, amount, paymentMethod);
//        return new ResponseEntity<>(payment, HttpStatus.CREATED);
//    }
//
//    // TODO: Other endpoints
//}
package com.example.EasyBuy_springboot.Controller;

import com.example.EasyBuy_springboot.model.Payment;
import com.example.EasyBuy_springboot.service.PaymentService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        Payment createdPayment = paymentService.createPayment(payment);
        return new ResponseEntity<>(createdPayment, HttpStatus.CREATED);
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Long paymentId) {
        Payment payment = paymentService.getPaymentById(paymentId);
        return payment != null ? new ResponseEntity<>(payment, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{paymentId}")
    public ResponseEntity<Payment> updatePayment(@PathVariable Long paymentId, @RequestBody Payment payment) {
        payment.setPaymentId(paymentId);
        Payment updatedPayment = paymentService.updatePayment(payment);
        return updatedPayment != null ? new ResponseEntity<>(updatedPayment, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{paymentId}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long paymentId) {
        paymentService.deletePayment(paymentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}

