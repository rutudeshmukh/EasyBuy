package com.example.EasyBuy_springboot.Controller;

import com.example.EasyBuy_springboot.ServiceImpl.ProductServiceImpl;
import com.example.EasyBuy_springboot.model.Product;
import com.example.EasyBuy_springboot.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductServiceImpl ser;

	@GetMapping("/fetchProduct")
	public List<Product> fetchProductList() {
		return ser.fetchProductList();
	}

	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return ser.saveProduct(product);
	}

	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@RequestBody Product product, @PathVariable("id") Long productId) {
		return ser.updateProduct(product, productId);
	}

	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") Long productId) {
		return "Product removed successfully";
	}

    // TODO: other REST endpoints as needed
}
