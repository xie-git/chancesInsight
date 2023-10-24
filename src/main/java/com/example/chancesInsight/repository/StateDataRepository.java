package com.example.chancesInsight.repository;

import com.example.chancesInsight.model.StateData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateDataRepository extends CrudRepository<StateData, String> {

}