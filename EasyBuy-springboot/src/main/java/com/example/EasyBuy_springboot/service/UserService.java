package com.example.EasyBuy_springboot.service;

import com.example.EasyBuy_springboot.model.User;
import com.example.EasyBuy_springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

	public Object findById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

    // TODO: other methods as needed
}

