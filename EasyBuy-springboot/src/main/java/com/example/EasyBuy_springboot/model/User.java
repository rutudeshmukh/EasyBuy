package com.example.EasyBuy_springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userName;
    private String userEmail;
    private String userPhoneNo;
    
    //TODO: getter ,setter and constructor
    
    //TODO: add or delete related controller, service, serviceImpl & repository accordingly

   
}

