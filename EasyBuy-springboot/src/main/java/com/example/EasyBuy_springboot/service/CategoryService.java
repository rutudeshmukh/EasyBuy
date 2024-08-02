package com.example.EasyBuy_springboot.service;

import com.example.EasyBuy_springboot.model.Category;
import com.example.EasyBuy_springboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // TODO: other methods as needed
}

