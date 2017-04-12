package com.epam.grow.springdata.entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private boolean activated;
    private boolean activatedSuperuser;
    private String activateHash;
    private Date registrationDate;
    private String phone;
    private String photo;
    private int id_role;

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean isActivatedSuperuser() {
        return activatedSuperuser;
    }

    public void setActivatedSuperuser(boolean activatedSuperuser) {
        this.activatedSuperuser = activatedSuperuser;
    }

    public String getActivateHash() {
        return activateHash;
    }

    public void setActivateHash(String activateHash) {
        this.activateHash = activateHash;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }
}
