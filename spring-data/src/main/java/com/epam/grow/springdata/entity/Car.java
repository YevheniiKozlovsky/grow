package com.epam.grow.springdata.entity;

import javax.persistence.Entity;

@Entity
public class Car {

    private int id;
    private String name;
    private String carNumber;
    private int power;
    private int placeNumer;
    private String color;
    private String photo;
    private int id_car_status;

    public Car() {}

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

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPlaceNumer() {
        return placeNumer;
    }

    public void setPlaceNumer(int placeNumer) {
        this.placeNumer = placeNumer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getId_car_status() {
        return id_car_status;
    }

    public void setId_car_status(int id_car_status) {
        this.id_car_status = id_car_status;
    }
}
