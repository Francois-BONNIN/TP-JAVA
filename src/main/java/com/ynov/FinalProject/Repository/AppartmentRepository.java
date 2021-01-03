package com.ynov.FinalProject.Repository;

import com.ynov.FinalProject.Domain.Appartment;

import com.ynov.FinalProject.Domain.AppartmentDTO;
import com.ynov.FinalProject.Domain.Residence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppartmentRepository extends JpaRepository<Appartment, Long>{

    @Query(value = "SELECT a FROM Appartment a JOIN fetch Residence r where r.region = :region")
    List<Appartment> findAppartmentsByRegion(String region);

    @Query(value = "SELECT a FROM Appartment a JOIN fetch Residence r where r.swimmingPool = :true")
    List<Appartment> findAppartmentsBySwimmingPool();

    @Query(value = "SELECT a FROM Appartment a JOIN fetch Residence r where r.typeOfEnvironment = 'mountain'")
    List<Appartment> findAppartmentsInMountain();

    /*
    @Query(value = "SELECT a FROM Appartment a JOIN fetch Residence r where = ")
    List<Appartment> findAppartmentsAvailableWithTwoDate();

    @Query(value = "SELECT a FROM Appartment a JOIN fetch Residence r where = ")
    List<Appartment> findAppartmentsAvailableBetweenTwoDate();
     */

    // Simple Request DTO :
    @Query(value = "SELECT NEW com.ynov.FinalProject.Domain.AppartmentDTO(a.id, a.dailyRate) " +
            "FROM Appartment a join fetch Residence r " +
            "where r.typeOfEnvironment = 'sea' " +
            "order by a.dailyRate")
    List<AppartmentDTO> getAppartmentBySeaOrderByDailyRate();


    // Complex Request DTO :
    @Query(value = "SELECT NEW com.ynov.FinalProject.Domain.AppartmentDTO(a.id, a.dailyRate) " +
            "FROM Appartment a join fetch Residence r " +
            "where r.typeOfEnvironment = 'sea' " +
            "and r.region = :region " +
            "and r.swimmingPool = true " +
            "and a.bedsNb >= 4 " +
            "order by a.dailyRate")
    List<AppartmentDTO> getAppartmentBySeaWithSwimmingPoolAndMore4Beds(String region);
}
