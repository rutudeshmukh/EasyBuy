package com.example.EasyBuy_springboot.Controller;

import com.example.EasyBuy_springboot.model.CartProduct;
import com.example.EasyBuy_springboot.service.CartProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cart-products")
public class CartProductController {

    @Autowired
    private CartProductService cartProductService;

    @GetMapping("/get")
    public List<CartProduct> getAllCartProducts() {
        return cartProductService.getAllCartProducts();
    }

    // TODO: other REST endpoints as needed
}

