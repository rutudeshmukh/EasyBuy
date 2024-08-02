package com.example.EasyBuy_springboot.Controller;

import com.example.EasyBuy_springboot.model.Cart;
import com.example.EasyBuy_springboot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/get")
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    // TODO: other REST endpoints as needed
}
