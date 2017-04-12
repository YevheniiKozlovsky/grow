package com.epam.grow.springdata.entity;

import javax.persistence.Entity;

@Entity
public class TripStatus {

    private int id;
    private String name;

    public TripStatus() {}

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
