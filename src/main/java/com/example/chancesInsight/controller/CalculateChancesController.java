package com.example.chancesInsight.controller;

import com.example.chancesInsight.model.PersonPreference;
import com.example.chancesInsight.service.CalculateChancesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/chances")
public class CalculateChancesController {

    @Autowired
    private final CalculateChancesService ccs;

    @Autowired
    public CalculateChancesController(CalculateChancesService ccs) {
        this.ccs = ccs;
    }

    @PostMapping("/calculate")
    public ResponseEntity<?> calculateChances(@RequestBody PersonPreference preference) {
        // Use the service to process the PersonPreference and obtain a result
        PersonPreference result = this.ccs.processPreference(preference);

        // Return the result (or you can modify this to return any other type of response)
        return ResponseEntity.ok(result);
    }

    @PostMapping("/countyPop")
    public ResponseEntity<?> calculateCountyPop(@RequestBody PersonPreference preference) {
        // Use the service to process the PersonPreference and obtain a result
        int countyPop = this.ccs.processPreferenceCounty(preference);

        // Return the result (or you can modify this to return any other type of response)
        return ResponseEntity.ok(countyPop);
    }

}