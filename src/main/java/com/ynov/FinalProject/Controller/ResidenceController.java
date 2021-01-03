package com.ynov.FinalProject.Controller;

import com.ynov.FinalProject.Domain.Residence;
import com.ynov.FinalProject.Domain.ResidenceDTO;
import com.ynov.FinalProject.Domain.Appartment;
import com.ynov.FinalProject.Domain.AppartmentDTO;

import com.ynov.FinalProject.Service.ResidenceService;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ResidenceController {

    ResidenceService residenceService;
    public ResidenceController(ResidenceService residenceService){
        this.residenceService = residenceService;
    }


    @GetMapping("/residence/name")
    @ResponseStatus(HttpStatus.OK)
    public Residence getResidenceByName(String name){
        return residenceService.getResidenceByName(name);
    }


    @GetMapping("/residences-and-appartments")
    @ResponseStatus(HttpStatus.OK)
    public List<Residence> getResidenceWithAppartements(){
        return residenceService.getResidenceWithAppartements();
    }


    @GetMapping("/residence/country")
    @ResponseStatus(HttpStatus.OK)
    public List<Residence> getResidenceByCountry(String country){
        return residenceService.getResidenceByCountry(country);
    }


    @GetMapping("/appartment/region")
    @ResponseStatus(HttpStatus.OK)
    public List<Appartment> findAppartementsByRegion(String region){
        return residenceService.findAppartementsByRegion(region);
    }


    @GetMapping("/appartment/swimmingpool")
    @ResponseStatus(HttpStatus.OK)
    public List<Appartment> findAppartmentsBySwimmingPool(){
        return residenceService.findAppartmentsBySwimmingPool();
    }


    @GetMapping("/appartment/mountain")
    @ResponseStatus(HttpStatus.OK)
    public List<Appartment> findAppartmentsInMountain(){
        return residenceService.findAppartmentsInMountain();
    }


    @GetMapping("/appartment/sea-order-by-dailyrate")
    @ResponseStatus(HttpStatus.OK)
    public List<AppartmentDTO> getAppartmentBySeaOrderByDailyRate(){
        return residenceService.getAppartmentBySeaOrderByDailyRate();
    }


    @GetMapping("/appartment/sea/swimmingpool/4beds")
    @ResponseStatus(HttpStatus.OK)
    public List<AppartmentDTO> getAppartmentBySeaWithSwimmingPoolAndMore4Beds(String region){
        return residenceService.getAppartmentBySeaWithSwimmingPoolAndMore4Beds(region);
    }


    // ----- CRUD APPARTMENT -----

    @PostMapping("/appartment/generate")
    @ResponseStatus(HttpStatus.OK)
    public void generateAppartement(){
        residenceService.generateAppartment();
    }


    @PostMapping("/appartment/create")
    @ResponseStatus(HttpStatus.OK)
    public Appartment createAppartment(Appartment appartmentRequest){
        return residenceService.createAppartment(appartmentRequest);
    }


    @GetMapping("/appartments")
    @ResponseStatus(HttpStatus.OK)
    public List<Appartment> indexAppartment(){
        return residenceService.indexAppartment();
    }


    @GetMapping("/appartment/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Appartment showAppartment(@PathVariable Long id){
        return residenceService.showAppartment(id);
    }


    @PatchMapping("/appartment/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Appartment updateAppartment(@PathVariable Long id, Appartment appartmentRequest){
        return residenceService.updateAppartment(id, appartmentRequest);
    }


    @DeleteMapping("/appartment/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Appartment deleteAppartment(@PathVariable Long id){
        return residenceService.deleteAppartment(id);
    }


    // ----- CRUD RESIDENCE -----

    @PostMapping("/residence/generate")
    @ResponseStatus(HttpStatus.OK)
    public void generateResidence(){
        residenceService.generateResidence();
    }


    @PostMapping("/residence/create")
    @ResponseStatus(HttpStatus.OK)
    public Residence createResidence(Residence residenceRequest){
        return residenceService.createResidence(residenceRequest);
    }


    @GetMapping("/residences")
    @ResponseStatus(HttpStatus.OK)
    public List<Residence> indexResidence(){
        return residenceService.indexResidence();
    }


    @GetMapping("/residence/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Residence showResidence(@PathVariable Long id){
        return residenceService.showResidence(id);
    }


    @PatchMapping("/residence/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Residence updateResidence(@PathVariable Long id, Residence residenceRequest){
        return residenceService.updateResidence(id, residenceRequest);
    }


    @DeleteMapping("/residence/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Residence deleteResidence(Long id){
        return residenceService.deleteResidence(id);
    }
}
