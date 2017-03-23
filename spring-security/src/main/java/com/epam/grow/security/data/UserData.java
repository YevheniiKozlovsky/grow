package com.epam.grow.security.data;

public class UserData {

    private String role;
    private String name;
    private String phone;

    public UserData(String role, String name, String phone) {
        this.role = role;
        this.name = name;
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
