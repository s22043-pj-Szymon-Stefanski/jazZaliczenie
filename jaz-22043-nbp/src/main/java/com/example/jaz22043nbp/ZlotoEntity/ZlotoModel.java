package com.example.jaz22043nbp.ZlotoEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Entity
public class ZlotoModel {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String startDate;
    private String endDate;
    private Date date = new Date();

    public ZlotoModel(String startDate, String endDate,Date date) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.date = date;
    }

    public ZlotoModel() {

    }

    public long getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public Date getDate() {
        return date;
    }
}
