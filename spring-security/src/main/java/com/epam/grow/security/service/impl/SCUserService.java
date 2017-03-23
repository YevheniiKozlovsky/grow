package com.epam.grow.security.service.impl;

import com.epam.grow.security.model.UserModel;
import com.epam.grow.security.repository.UserRepository;
import com.epam.grow.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class SCUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel getUser(String login) {
        Assert.notNull(login, "Login can not be null");
        return userRepository.findByLogin(login);
    }
}
