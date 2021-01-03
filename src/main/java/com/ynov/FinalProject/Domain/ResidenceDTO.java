package com.ynov.FinalProject.Domain;

import java.util.Set;

public class ResidenceDTO {

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


    public int nbAppartment;
    public int getNbAppartment() {
        return nbAppartment;
    }
    public void setNbAppartment(int nbAppartment) {
        this.nbAppartment = nbAppartment;
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

    public ResidenceDTO(String name, boolean swimmingPool,boolean spa, boolean childcare, boolean wifi, int nbAppartment, String country, String region, String address, String GPS, String typeOfEnvironment){
        this.name = name;
        this.swimmingPool = swimmingPool;
        this.spa = spa;
        this.childcare = childcare;
        this.wifi = wifi;
        this.nbAppartment = nbAppartment;
        this.country = country;
        this.region = region;
        this.address = address;
        this.GPS = GPS;
        this.typeOfEnvironment = typeOfEnvironment;
    }
}
