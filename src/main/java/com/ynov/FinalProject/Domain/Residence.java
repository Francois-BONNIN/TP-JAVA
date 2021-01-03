package com.ynov.FinalProject.Domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Residence {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @OneToMany
    @JoinColumn(name="RESIDENCE_ID")
    private Set<Appartment> appartments;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public Set<Appartment> getAppartments() {
        return appartments;
    }
    public void setAppartments(Set<Appartment> appartments) {
        this.appartments = appartments;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private boolean swimmingPool;
    public boolean isSwimmingPool() {
        return swimmingPool;
    }
    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    private boolean spa;
    public boolean isSpa() {
        return spa;
    }
    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    private boolean childcare;
    public boolean isChildcare() {
        return childcare;
    }
    public void setChildcare(boolean childcare) {
        this.childcare = childcare;
    }

    private boolean wifi;
    public boolean isWifi() {
        return wifi;
    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    private String country;
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    private String region;
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    private String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    private String GPS;
    public String getGPS() {
        return GPS;
    }
    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    private String typeOfEnvironment;
    public String getTypeOfEnvironment() {
        return typeOfEnvironment;
    }
    public void setTypeOfEnvironment(String typeOfEnvironment) {
        this.typeOfEnvironment = typeOfEnvironment;
    }

}
