package com.example.EasyBuy_springboot.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Admin {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    private String adminName;
    private String adminEmail;
    private String adminPhoneNo;
    
    //TODO: getter ,setter and constructor
    
    //TODO: add or delete related controller, service, serviceImpl & repository accordingly
    //TODO: do R&D on admin part , methods addCategory, deleteCategory, updateCategory & deleteCategory
}
