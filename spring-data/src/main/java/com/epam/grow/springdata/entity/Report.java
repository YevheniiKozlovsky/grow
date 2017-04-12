package com.epam.grow.springdata.entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Report {

    private int id;
    private Date date;
    private String description;
    private int id_reporter;
    private int id_car_status;
    private int id_trip;

    public Report() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_reporter() {
        return id_reporter;
    }

    public void setId_reporter(int id_reporter) {
        this.id_reporter = id_reporter;
    }

    public int getId_car_status() {
        return id_car_status;
    }

    public void setId_car_status(int id_car_status) {
        this.id_car_status = id_car_status;
    }

    public int getId_trip() {
        return id_trip;
    }

    public void setId_trip(int id_trip) {
        this.id_trip = id_trip;
    }
}
