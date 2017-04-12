package com.epam.grow.springdata.entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Trip {

    private int id;
    private int number;
    private String strartPoint;
    private String endPoint;
    private Date date;
    private Date startDate;
    private Date endDate;
    private int id_car;
    private int id_trip_status;
    private int id_creater;
    private int id_driver;
    private int id_report;

    public Trip() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStrartPoint() {
        return strartPoint;
    }

    public void setStrartPoint(String strartPoint) {
        this.strartPoint = strartPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public int getId_trip_status() {
        return id_trip_status;
    }

    public void setId_trip_status(int id_trip_status) {
        this.id_trip_status = id_trip_status;
    }

    public int getId_creater() {
        return id_creater;
    }

    public void setId_creater(int id_creater) {
        this.id_creater = id_creater;
    }

    public int getId_driver() {
        return id_driver;
    }

    public void setId_driver(int id_driver) {
        this.id_driver = id_driver;
    }

    public int getId_report() {
        return id_report;
    }

    public void setId_report(int id_report) {
        this.id_report = id_report;
    }
}
