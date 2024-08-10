package com.example.EasyBuy_springboot.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EasyBuy_springboot.model.Product;
import com.example.EasyBuy_springboot.repository.ProductRepository;
import com.example.EasyBuy_springboot.service.ProductService;

public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository prepo;
	
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return prepo.save(product);
	}

	public List<Product> fetchProductList() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

	public Product updateProduct(Product product, Long productId) {
		// TODO Auto-generated method stub
		Product p = prepo.findById(productId).get();
		if (p.getProductId() == productId) {
			p.setProductName(product.getProductName());
			p.setProductPrice(product.getProductPrice());
		} else {
			throw new NullPointerException();
		}
		Product updatePro = prepo.save(p);
		return updatePro;
	}

	public void deleteProduct(Long productId) {
		// TODO Auto-generated method stub
		prepo.deleteById(productId);
	}
}
