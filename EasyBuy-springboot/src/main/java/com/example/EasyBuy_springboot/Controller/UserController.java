package com.example.EasyBuy_springboot.Controller;

import com.example.EasyBuy_springboot.model.User;
import com.example.EasyBuy_springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // TODO: REST endpoints as needed
}
