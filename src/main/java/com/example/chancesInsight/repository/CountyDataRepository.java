package com.example.chancesInsight.repository;

import com.example.chancesInsight.model.CountyData;
import com.example.chancesInsight.model.keys.CountyDataKey;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CountyDataRepository extends CrudRepository<CountyData, CountyDataKey> {
    Optional<CountyData> findByKeyStateAndKeyCountyAndKeyAgeGrp(String state, String county, int ageGrp);
}
