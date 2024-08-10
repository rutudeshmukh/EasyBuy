package com.example.EasyBuy_springboot.service;

import java.util.List;

import com.example.EasyBuy_springboot.model.Product;

public interface ProductService {

	Product saveProduct(Product product);

	List<Product> fetchProductList();

	Product updateProduct(Product product, Long productId);

	void deleteProduct(Long productId);
}
