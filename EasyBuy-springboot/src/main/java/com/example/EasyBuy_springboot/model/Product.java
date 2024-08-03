package com.example.EasyBuy_springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private double price;
    
    @Column(nullable = false)
    private Integer quantity;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category; 
    
    // TODO: getter, setter & constructor
    
  //TODO: add or delete related controller, service, serviceImpl & repository accordingly
    

    
}

