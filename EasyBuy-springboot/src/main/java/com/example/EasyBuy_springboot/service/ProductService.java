package com.example.EasyBuy_springboot.service;

import com.example.EasyBuy_springboot.model.Product;
import com.example.EasyBuy_springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // TODO: other methods as needed
}

