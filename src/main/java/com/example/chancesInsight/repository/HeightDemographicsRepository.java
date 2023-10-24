package com.example.chancesInsight.repository;

import com.example.chancesInsight.model.HeightDemographics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HeightDemographicsRepository extends CrudRepository<HeightDemographics, Long> {

    @Query("SELECT CASE :agePref " +
            "WHEN 'height_20_29' THEN h.height20_29 " +
            "WHEN 'height_30_39' THEN h.height30_39 " +
            "WHEN 'height_40_49' THEN h.height40_49 " +
            "WHEN 'height_50_59' THEN h.height50_59 " +
            "WHEN 'height_60_69' THEN h.height60_69 " +
            "WHEN 'height_70_79' THEN h.height70_79 " +
            "END " +
            "FROM HeightDemographics h WHERE h.gender = :gender " +
            "AND (h.heightInInches = :minHeight OR h.heightInInches = :maxHeight)")
    List<Double> findByPreferences(
            @Param("gender") String gender,
            @Param("agePref") String agePref,
            @Param("minHeight") Integer minHeight,
            @Param("maxHeight") Integer maxHeight);

    // REMEMBER agePref is supposed to be a string like 'height_20_29' for now
}