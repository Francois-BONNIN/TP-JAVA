package com.ynov.FinalProject.Service;

import com.ynov.FinalProject.Domain.Residence;
import com.ynov.FinalProject.Domain.AppartmentDTO;
import com.ynov.FinalProject.Domain.Appartment;

import com.ynov.FinalProject.Repository.AppartmentRepository;
import com.ynov.FinalProject.Repository.ResidenceRepository;


import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class ResidenceService {

    private AppartmentRepository appartmentRepository;
    private ResidenceRepository residenceRepository;

    public ResidenceService(AppartmentRepository appartmentRepository, ResidenceRepository residenceRepository){
        this.appartmentRepository = appartmentRepository;
        this.residenceRepository = residenceRepository;
    }

    private Residence residenceFindById(Long id){
        return this.residenceRepository.findById(id).get();
    }

    private Appartment appartmentFindById(Long id){
        return this.appartmentRepository.findById(id).get();
    }

    public Residence getResidenceByName(String name){
        return residenceRepository.getResidenceByName(name);
    };

    public List<Residence> getResidenceWithAppartements(){
        return residenceRepository.getResidenceWithAppartments();
    }

    public List<Residence> getResidenceByCountry(String country){
        return residenceRepository.getResidenceByCountry(country);
    }

    public List<Appartment> findAppartementsByRegion(String region){
        return appartmentRepository.findAppartmentsByRegion(region);
    }

    public List<Appartment> findAppartmentsBySwimmingPool(){
        return appartmentRepository.findAppartmentsBySwimmingPool();
    }

    public List<Appartment> findAppartmentsInMountain(){
        return appartmentRepository.findAppartmentsInMountain();
    }

    public List<AppartmentDTO> getAppartmentBySeaOrderByDailyRate(){
        List<AppartmentDTO> AppartmentsDTORequest = appartmentRepository.getAppartmentBySeaOrderByDailyRate();
        AppartmentsDTORequest.stream().forEach(System.out::println);
        return AppartmentsDTORequest;
    }

    public List<AppartmentDTO> getAppartmentBySeaWithSwimmingPoolAndMore4Beds(String region){
        List<AppartmentDTO> AppartmentsDTORequestComplex = appartmentRepository.getAppartmentBySeaWithSwimmingPoolAndMore4Beds(region);
        AppartmentsDTORequestComplex.stream().forEach(System.out::println);
        return AppartmentsDTORequestComplex;
    }


    // ----- CRUD APPARTMENT -----

    public void generateAppartment(){
        Appartment appartment = new Appartment();
        appartment.setBedsNb(ThreadLocalRandom.current().nextInt(1, 10 + 1));
        appartment.setSurface(ThreadLocalRandom.current().nextInt(15, 100 + 1));
        appartment.setBabyEquipment(Math.random() < 0.5);
        appartment.setAirConditioning(Math.random() < 0.5);
        appartment.setDailyRate(ThreadLocalRandom.current().nextInt(30, 200 + 1));

        long start = Timestamp.valueOf(2021+1+"-1-1 0:0:0").getTime();
        long end = Timestamp.valueOf(2023+"-1-1 0:0:0").getTime();
        long ms=(long) ((end-start)*Math.random()+start);
        long mss=(long) ((end-start)*Math.random()+start);
        Date arrival = new Date(ms);
        Date departure = new Date(mss);

        appartment.setArrivalDate(arrival);
        appartment.setDepartureDate(departure);
        appartment.setDailyRate(ThreadLocalRandom.current().nextInt(30, 200 + 1));
        appartmentRepository.save(appartment);
    }

    public Appartment createAppartment(Appartment appartmentRequest){
        Appartment appartment = new Appartment();
        appartment.setBedsNb(appartmentRequest.getBedsNb());
        appartment.setSurface(appartmentRequest.getSurface());
        appartment.setBabyEquipment(appartmentRequest.isBabyEquipment());
        appartment.setAirConditioning(appartmentRequest.isAirConditioning());

        appartment.setDailyRate(appartmentRequest.getDailyRate());
        appartment.setArrivalDate(appartmentRequest.getArrivalDate());
        appartment.setDepartureDate(appartmentRequest.getDepartureDate());
        this.appartmentRepository.save(appartment);
        return appartment;
    }

    public List<Appartment> indexAppartment() {
        return this.appartmentRepository.findAll();
    }

    public Appartment showAppartment(Long id) {
        return this.appartmentFindById(id);
    }

    public Appartment updateAppartment(Long id, Appartment appartmentRequest) {
        Appartment appartment = this.appartmentFindById(id);
        appartment.setBedsNb(appartmentRequest.getBedsNb());
        appartment.setSurface(appartmentRequest.getSurface());
        appartment.setBabyEquipment(appartmentRequest.isBabyEquipment());
        appartment.setAirConditioning(appartmentRequest.isAirConditioning());

        appartment.setDailyRate(appartmentRequest.getDailyRate());
        appartment.setArrivalDate(appartmentRequest.getArrivalDate());
        appartment.setDepartureDate(appartmentRequest.getDepartureDate());

        this.appartmentRepository.save(appartment);
        return appartment;
    }

    public Appartment deleteAppartment(Long id) {
        Appartment appartment = this.appartmentFindById(id);
        this.appartmentRepository.delete(appartment);
        return appartment;
    }


    // ----- CRUD RESIDENCE -----

    public void generateResidence(){
        Residence residence = new Residence();
        residence.setName("Alpha - " + (int)(Math.random()*100));
        residence.setSwimmingPool(Math.random() < 0.5);
        residence.setSpa(Math.random() < 0.5);
        residence.setChildcare(Math.random() < 0.5);
        residence.setWifi(Math.random() < 0.5);

        String[] countries = {"France", "USA","Espagne", "Italie"};
        String country = countries[(int) (Math.random() * countries.length)];
        residence.setCountry(country);

        String[] regions = {"Occitanie", "Californie","Catalogne"};
        String region = regions[(int) (Math.random() * regions.length)];
        residence.setRegion(region);

        residence.setAddress("25 street - " + (int)(Math.random()*100));
        residence.setGPS("N "+ (int)(Math.random()*100)+ "°" + (int)(Math.random()*100) + "'" + (int)(Math.random()*100) + "  E "+ (int)(Math.random()*100) + "°" + (int)(Math.random()*100) + "'" +(int)(Math.random()*100));

        String[] environments = {"sea", "mountains","campaign"};
        String environment = environments[(int) (Math.random() * environments.length)];
        residence.setTypeOfEnvironment(environment);

        residenceRepository.save(residence);
    }

    public Residence createResidence(Residence residenceRequest){
        Residence residence = new Residence();
        residence.setName(residenceRequest.getName());
        residence.setSwimmingPool(residenceRequest.isSwimmingPool());
        residence.setSpa(residenceRequest.isSpa());
        residence.setChildcare(residenceRequest.isChildcare());
        residence.setWifi(residenceRequest.isWifi());

        residence.setCountry(residenceRequest.getCountry());
        residence.setRegion(residenceRequest.getRegion());
        residence.setAddress(residenceRequest.getAddress());
        residence.setGPS(residenceRequest.getGPS());

        residence.setTypeOfEnvironment(residenceRequest.getTypeOfEnvironment());

        this.residenceRepository.save(residence);
        return residence;
    }

    public List<Residence> indexResidence() {
        return this.residenceRepository.findAll();
    }

    public Residence showResidence(Long id) {
        return this.residenceFindById(id);
    }

    public Residence updateResidence(Long id, Residence residenceRequest) {
        Residence residence = this.residenceFindById(id);
        residence.setName(residenceRequest.getName());
        residence.setSwimmingPool(residenceRequest.isSwimmingPool());
        residence.setSpa(residenceRequest.isSpa());
        residence.setChildcare(residenceRequest.isChildcare());
        residence.setWifi(residenceRequest.isWifi());

        residence.setCountry(residenceRequest.getCountry());
        residence.setRegion(residenceRequest.getRegion());
        residence.setAddress(residenceRequest.getAddress());
        residence.setGPS(residenceRequest.getGPS());
        residence.setTypeOfEnvironment(residenceRequest.getTypeOfEnvironment());

        this.residenceRepository.save(residence);
        return residence;
    }

    public Residence deleteResidence(Long id) {
        Residence residence = this.residenceFindById(id);
        this.residenceRepository.delete(residence);
        return residence;
    }
}
