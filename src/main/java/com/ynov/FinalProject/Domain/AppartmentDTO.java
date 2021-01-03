package com.ynov.FinalProject.Domain;

import java.util.Date;

public class AppartmentDTO {

    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int bedsNb;
    public int getBedsNb(){return bedsNb;}
    public void setBedsNb(int bedsNb) {
        this.bedsNb = bedsNb;
    }

    private int dailyRate;
    public int getDailyRate() {
        return dailyRate;
    }
    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    private Date arrivalDate;
    public Date getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    private Date departureDate;
    public Date getDepartureDate() {
        return departureDate;
    }
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }


    public AppartmentDTO(Long id, int dailyRate){
        this.id = id;
        this.dailyRate = dailyRate;
    }
}
