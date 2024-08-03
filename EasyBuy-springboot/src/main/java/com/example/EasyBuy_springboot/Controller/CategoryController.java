package com.example.EasyBuy_springboot.Controller;

import com.example.EasyBuy_springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    

    // TODO: REST endpoints as needed
}

