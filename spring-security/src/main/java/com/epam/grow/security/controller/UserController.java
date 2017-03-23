package com.epam.grow.security.controller;

import com.epam.grow.security.data.UserData;
import com.epam.grow.security.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @PreAuthorize("hasAuthority('ADMIN')")
    @RequestMapping(value = "/users/adminAuthority/{userID}", method = RequestMethod.GET)
    public ResponseEntity<UserData> getUserInfoWithAdminAuthority(@PathVariable String userID) {

        Assert.notNull(userID, "Parameter with name 'User ID' can not bu null");

        return new ResponseEntity<>(userFacade.getUserInfo(userID), HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('USER')")
    @RequestMapping(value = "/users/userAuthority/{userID}", method = RequestMethod.GET)
    public ResponseEntity<UserData> getUserInfoWithUserAuthority(@PathVariable String userID) {

        Assert.notNull(userID, "Parameter with name 'User ID' can not bu null");

        return new ResponseEntity<>(userFacade.getUserInfo(userID), HttpStatus.OK);
    }

}
