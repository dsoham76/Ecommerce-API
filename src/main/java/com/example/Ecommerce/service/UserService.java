package com.example.Ecommerce.service;

import com.example.Ecommerce.model.User;
import com.example.Ecommerce.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public User getUser(Integer userId) {
        Optional<User> users=userRepo.findById(userId);
        User user=users.get();
        if(users.isPresent())
            return user;
        else
            return null;
    }
}
