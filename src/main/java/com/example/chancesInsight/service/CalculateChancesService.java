package com.example.chancesInsight.service;

import com.example.chancesInsight.model.*;
import com.example.chancesInsight.repository.CalculateChancesRepository;
import com.example.chancesInsight.repository.CountyDataRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CalculateChancesService {

    @Autowired
    private final CalculateChancesRepository ccr;

    @Autowired
    private final CountyDataRepository cdr;

    private static final Logger logger = LoggerFactory.getLogger(CalculateChancesService.class);

    public CalculateChancesService(CalculateChancesRepository ccr, CountyDataRepository cdr) {
        this.ccr = ccr;
        this.cdr = cdr;
    }

    public PersonPreference processPreference(PersonPreference preference) {
        return this.ccr.save(preference);
    }

    public int processPreferenceCounty(PersonPreference preference) {
        Gender genderPreference = preference.getGenderPreference();
        Race racePreference = preference.getRacePreference();
        int agePreferenceLow = preference.getAgeRangeLower();
        int agePreferenceHigh = preference.getAgeRangeUpper();
        boolean hasChildren = preference.isHasChildren();
        String countyPreference = preference.getCountyPreference();
        int heightPreferenceLow = preference.getHeightRangeLower();
        int heightPreferenceHigh = preference.getHeightRangeUpper();
        String state = preference.getStatePreference().toString();

        CountyData countyData = this.cdr.findByKeyStateAndKeyCountyAndKeyAgeGrp(state, countyPreference, 0).get();
        int totalCountyPopulation = countyData.getTotPop();

        if (genderPreference == Gender.MALE) {
            int totalMalePopulation = this.cdr.findByKeyStateAndKeyCountyAndKeyAgeGrp(state, countyPreference, 0).get().getMalePop();
            return totalMalePopulation;
        } else {
            int totalFemalePopulation = this.cdr.findByKeyStateAndKeyCountyAndKeyAgeGrp(state, countyPreference, 0).get().getFemalePop();
            return totalFemalePopulation;
        }
    }
}