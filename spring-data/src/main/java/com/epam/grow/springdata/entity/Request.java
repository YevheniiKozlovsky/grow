package com.epam.grow.springdata.entity;

import javax.persistence.Entity;

@Entity
public class Request {

    private int id;
    private boolean response;
    private int id_account;
    private int id_request_car;
    private int id_trip;
    private int id_respondent;

    public Request() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public int getId_account() {
        return id_account;
    }

    public void setId_account(int id_account) {
        this.id_account = id_account;
    }

    public int getId_request_car() {
        return id_request_car;
    }

    public void setId_request_car(int id_request_car) {
        this.id_request_car = id_request_car;
    }

    public int getId_trip() {
        return id_trip;
    }

    public void setId_trip(int id_trip) {
        this.id_trip = id_trip;
    }

    public int getId_respondent() {
        return id_respondent;
    }

    public void setId_respondent(int id_respondent) {
        this.id_respondent = id_respondent;
    }
}
