package com.epam.grow.security.facade.impl;

import com.epam.grow.security.data.UserData;
import com.epam.grow.security.facade.UserFacade;
import com.epam.grow.security.model.UserModel;
import com.epam.grow.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SCUserFacade implements UserFacade {

    @Autowired
    private UserService userService;

    public UserData getUserInfo(String login) {
        UserModel userModel = userService.getUser(login);
        return new UserData(userModel.getAuthority(), userModel.getName(), userModel.getPhone());
    }
}
