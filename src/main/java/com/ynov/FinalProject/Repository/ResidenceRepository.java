package com.ynov.FinalProject.Repository;

import com.ynov.FinalProject.Domain.Appartment;
import com.ynov.FinalProject.Domain.Residence;
import com.ynov.FinalProject.Domain.ResidenceDTO;
import com.ynov.FinalProject.Domain.AppartmentDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResidenceRepository extends JpaRepository <Residence, Long> {

    @Query(value = "SELECT r FROM Residence r where r.name = :name")
    Residence getResidenceByName(String name);

    @Query(value = "SELECT r FROM Residence r JOIN FETCH r.appartments")
    List<Residence> getResidenceWithAppartments();

    @Query(value = "SELECT r FROM Residence r where r.country = :country")
    List<Residence> getResidenceByCountry(String country);

}
