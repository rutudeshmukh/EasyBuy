package com.example.EasyBuy_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String categoryName;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
    
    // TODO: getter, setter & constructor
    
  //TODO: add or delete related controller, service, serviceImpl & repository accordingly
    
}

