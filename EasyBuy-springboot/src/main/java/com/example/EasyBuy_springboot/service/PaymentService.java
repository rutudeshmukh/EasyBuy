//package com.example.EasyBuy_springboot.service;
//
//import java.math.BigDecimal;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.EasyBuy_springboot.PaymentStatus;
//import com.example.EasyBuy_springboot.model.Cart;
//import com.example.EasyBuy_springboot.model.Payment;
//import com.example.EasyBuy_springboot.repository.PaymentRepository;
//
//import jakarta.transaction.Transactional;
//
//@Service
//public class PaymentService {
//    @Autowired
//    private PaymentRepository paymentRepository;
//
//    @Transactional
//    public Payment processPayment(Cart order, BigDecimal amount, String paymentMethod) {
//        Payment payment = new Payment();
//        payment.setOrder(order);
//        payment.setAmount(amount);
//        payment.setPaymentMethod(paymentMethod);
//        payment.setStatus(PaymentStatus.PENDING);
//        return paymentRepository.save(payment);
//    }
//
//    // Other business methods
//}

package com.example.EasyBuy_springboot.service;

import com.example.EasyBuy_springboot.model.Payment;

public interface PaymentService {
    Payment createPayment(Payment payment);
    Payment getPaymentById(Long id);
    Payment updatePayment(Payment payment);
    void deletePayment(Long id);
}

