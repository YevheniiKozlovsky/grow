package com.epam.grow.security.service;

import com.epam.grow.security.model.UserModel;

public interface UserService {

    UserModel getUser(String login);

}
