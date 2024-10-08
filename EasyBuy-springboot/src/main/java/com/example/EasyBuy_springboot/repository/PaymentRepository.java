//package com.example.EasyBuy_springboot.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.example.EasyBuy_springboot.model.Cart;
//import com.example.EasyBuy_springboot.model.Payment;
//
//public interface PaymentRepository extends JpaRepository<Payment, Long> {
//    List<Payment> findByOrder(Cart cart);
//}

package com.example.EasyBuy_springboot.repository;

import com.example.EasyBuy_springboot.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
