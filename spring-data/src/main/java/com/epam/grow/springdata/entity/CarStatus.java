package com.epam.grow.springdata.entity;

import javax.persistence.Entity;

@Entity
public class CarStatus {

    private int id;
    private String name;

    public CarStatus() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
