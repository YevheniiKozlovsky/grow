package com.epam.grow.security.service.impl;

import com.epam.grow.security.model.UserModel;
import com.epam.grow.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.Objects;

@Service
public class SCUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Assert.notNull(login, "Login can't be null");

        UserModel userModel = userService.getUser(login);

        if (Objects.nonNull(userModel)) {
            return new User(
                    userModel.getLogin(),
                    userModel.getPassword(),
                    Arrays.asList(userModel::getAuthority)
            );
        }

        throw new UsernameNotFoundException("User with login [" + login + "] was not found");
    }
}
