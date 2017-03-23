package com.epam.grow.security.model;

import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User")
@Proxy(lazy = false)
public class UserModel {

    @Id
    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String authority;

    @Column
    private String name;

    @Column
    private String phone;

    public UserModel() {}

    public UserModel(String login, String password, String authority, String name, String phone) {
        this.login = login;
        this.password = password;
        this.authority = authority;
        this.name = name;
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
