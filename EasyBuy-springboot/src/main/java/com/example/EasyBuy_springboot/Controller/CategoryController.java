package com.example.EasyBuy_springboot.Controller;

import com.example.EasyBuy_springboot.model.Category;
import com.example.EasyBuy_springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/get")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    // TODO: other REST endpoints as needed
}

