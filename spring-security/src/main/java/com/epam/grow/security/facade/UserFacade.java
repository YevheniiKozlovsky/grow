package com.epam.grow.security.facade;

import com.epam.grow.security.data.UserData;

public interface UserFacade {

    UserData getUserInfo(String login);

}
