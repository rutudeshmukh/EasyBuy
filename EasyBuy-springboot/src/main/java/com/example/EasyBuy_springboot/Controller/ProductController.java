package com.example.EasyBuy_springboot.Controller;

import com.example.EasyBuy_springboot.model.Product;
import com.example.EasyBuy_springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    // TODO: other REST endpoints as needed
}
