package com.example.jaz22043nbp.Entity;

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
    private float cena;
    private Date date = new Date();

    public ZlotoModel(String startDate, String endDate, float cena, Date date) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.cena = cena;
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

    public float getCena() {
        return cena;
    }

    public Date getDate() {
        return date;
    }
}
