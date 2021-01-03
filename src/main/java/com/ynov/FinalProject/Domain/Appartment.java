package com.ynov.FinalProject.Domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"bedsNb","surface","babyEquipment","airConditioning","dailyRate","arrivalDate","departureDate"})})

public class Appartment {

    private int bedsNb;
    public int getBedsNb(){return bedsNb;}
    public void setBedsNb(int bedsNb) {
        this.bedsNb = bedsNb;
    }

    private int surface;
    public int getSurface() {
        return surface;
    }
    public void setSurface(int surface) {
        this.surface = surface;
    }

    private boolean babyEquipment;
    public boolean isBabyEquipment() {
        return babyEquipment;
    }
    public void setBabyEquipment(boolean babyEquipment) {
        this.babyEquipment = babyEquipment;
    }

    private boolean airConditioning;
    public boolean isAirConditioning() {
        return airConditioning;
    }
    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
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



    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
}
