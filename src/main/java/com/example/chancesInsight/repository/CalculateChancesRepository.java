package com.example.chancesInsight.repository;

import com.example.chancesInsight.model.PersonPreference;
import com.example.chancesInsight.model.States;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculateChancesRepository extends CrudRepository<PersonPreference, Integer> {

}