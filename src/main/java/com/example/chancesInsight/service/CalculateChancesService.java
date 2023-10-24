package com.example.chancesInsight.service;

import com.example.chancesInsight.model.*;
import com.example.chancesInsight.model.keys.CountyDataKey;
import com.example.chancesInsight.repository.CalculateChancesRepository;
import com.example.chancesInsight.repository.CountyDataRepository;
import com.example.chancesInsight.repository.HeightDemographicsRepository;
import com.example.chancesInsight.repository.StateDataRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CalculateChancesService {

    @Autowired
    private final CalculateChancesRepository ccr;

    @Autowired
    private final CountyDataRepository cdr;

    @Autowired
    private final HeightDemographicsRepository hdr;

    @Autowired
    private final StateDataRepository sdr;

    private static final Logger logger = LoggerFactory.getLogger(CalculateChancesService.class);

    public CalculateChancesService(CalculateChancesRepository ccr, CountyDataRepository cdr, HeightDemographicsRepository hdr, StateDataRepository sdr) {
        this.ccr = ccr;
        this.cdr = cdr;
        this.hdr = hdr;
        this.sdr = sdr;
    }

    public PersonPreference processPreference(PersonPreference preference) {
        return this.ccr.save(preference);
    }

    public double calculateHeightProportion(Gender genderPreference, int agePreferenceLow, int agePreferenceHigh, int heightPreferenceLow, int heightPreferenceHigh) {
        String agePref;
        if (agePreferenceHigh < 29) {
            agePref = "height_20_29";
        } else if (agePreferenceHigh < 39) {
            agePref = "height_30_39";
        } else if (agePreferenceHigh < 49) {
            agePref = "height_40_49";
        } else if (agePreferenceHigh < 59) {
            agePref = "height_50_59";
        } else if (agePreferenceHigh < 69) {
            agePref = "height_60_69";
        } else {
            agePref = "height_70_79";
        }


        List<Double> minMaxHeightProportion = this.hdr.findByPreferences(genderPreference.toString(), agePref, heightPreferenceLow, heightPreferenceHigh);

        double heightPrefProp = minMaxHeightProportion.get(1) - minMaxHeightProportion.get(0);
        return heightPrefProp;
    }

    public int calculateMarriageRateByAge(int agePreferenceLow, int agePreferenceHigh) {
        int married18_24 = 9;
        int married25_34 = 44;
        int married35_44 = 62;
        int married45plus = 61;

        double result = 0;

        if (agePreferenceLow <= 24) {
            if (agePreferenceHigh <= 24) {
                double proportion = (agePreferenceHigh - agePreferenceLow + 1) / 7.0;
                result += proportion * married18_24;
            } else {
                double proportion = (24 - agePreferenceLow + 1) / 7.0;
                result += proportion * married18_24;
            }
        }

        if (agePreferenceLow <= 34 && agePreferenceHigh >= 25) {
            double lowerBound = Math.max(25, agePreferenceLow);
            double upperBound = Math.min(34, agePreferenceHigh);
            double proportion = (upperBound - lowerBound + 1) / 10.0;
            result += proportion * married25_34;
        }

        if (agePreferenceLow <= 44 && agePreferenceHigh >= 35) {
            double lowerBound = Math.max(35, agePreferenceLow);
            double upperBound = Math.min(44, agePreferenceHigh);
            double proportion = (upperBound - lowerBound + 1) / 10.0;
            result += proportion * married35_44;
        }

        if (agePreferenceHigh >= 45) {
            double lowerBound = Math.max(45, agePreferenceLow);
            double proportion = (agePreferenceHigh - lowerBound + 1) / (agePreferenceHigh - agePreferenceLow + 1.0);
            result += proportion * married45plus;
        }

        return (int) Math.round(result);
    }

    public List<Integer> calculateAgeGroups(int agePreferenceLow, int agePreferenceHigh) {
        List<Integer> ageGroups = new ArrayList<>();

        if (agePreferenceLow <= 4) ageGroups.add(1);
        if (agePreferenceLow <= 9 && agePreferenceHigh >= 5) ageGroups.add(2);
        if (agePreferenceLow <= 14 && agePreferenceHigh >= 10) ageGroups.add(3);
        if (agePreferenceLow <= 19 && agePreferenceHigh >= 15) ageGroups.add(4);
        if (agePreferenceLow <= 24 && agePreferenceHigh >= 20) ageGroups.add(5);
        if (agePreferenceLow <= 29 && agePreferenceHigh >= 25) ageGroups.add(6);
        if (agePreferenceLow <= 34 && agePreferenceHigh >= 30) ageGroups.add(7);
        if (agePreferenceLow <= 39 && agePreferenceHigh >= 35) ageGroups.add(8);
        if (agePreferenceLow <= 44 && agePreferenceHigh >= 40) ageGroups.add(9);
        if (agePreferenceLow <= 49 && agePreferenceHigh >= 45) ageGroups.add(10);
        if (agePreferenceLow <= 54 && agePreferenceHigh >= 50) ageGroups.add(11);
        if (agePreferenceLow <= 59 && agePreferenceHigh >= 55) ageGroups.add(12);
        if (agePreferenceLow <= 64 && agePreferenceHigh >= 60) ageGroups.add(13);
        if (agePreferenceLow <= 69 && agePreferenceHigh >= 65) ageGroups.add(14);
        if (agePreferenceLow <= 74 && agePreferenceHigh >= 70) ageGroups.add(15);
        if (agePreferenceLow <= 79 && agePreferenceHigh >= 75) ageGroups.add(16);
        if (agePreferenceLow <= 84 && agePreferenceHigh >= 80) ageGroups.add(17);
        if (agePreferenceHigh >= 85) ageGroups.add(18);

        return ageGroups;
    }

    public int queryDatabaseForAgeGroupInCounty(int ageGroup, String state, String county, Gender gender) {
        Optional<CountyData> countyDataOpt = cdr.findByKeyStateAndKeyCountyAndKeyAgeGrp(state, county, ageGroup);

        if (countyDataOpt.isPresent()) {
            CountyData countyData = countyDataOpt.get();
            // Assuming you have a method or field in CountyData class to get the population
            if (Objects.equals(gender.toString(), "MALE")) {
                return countyData.getMalePop();
            } else {
                return countyData.getFemalePop();
            }
        } else {
            // Handle the scenario where there's no matching county data for the provided criteria.
            return 0;
        }
    }

    public int calculateTotalPopOfAgeRangeInCounty(Gender gender, int agePreferenceLow, int agePreferenceHigh, String state, String county) {
        List<Integer> ageGroups = calculateAgeGroups(agePreferenceLow, agePreferenceHigh);

        int totalPopulation = 0;

        for (int ageGroup : ageGroups) {
            int populationForAgeGroup = queryDatabaseForAgeGroupInCounty(ageGroup, state, county, gender);

            // Apply proportion calculation for edge age groups
            if (ageGroup == ageGroups.get(0)) {
                // If it's the first age group in the list, consider proportion for the lower age preference
                int ageGroupStart = (ageGroup - 1) * 5 + 1; // Deriving starting age of the age group
                double proportion = (ageGroupStart + 4 - agePreferenceLow + 1) / 5.0;
                totalPopulation += populationForAgeGroup * proportion;
            } else if (ageGroup == ageGroups.get(ageGroups.size() - 1)) {
                // If it's the last age group in the list, consider proportion for the higher age preference
                int ageGroupEnd = ageGroup * 5; // Deriving ending age of the age group
                double proportion = (agePreferenceHigh - ageGroupEnd + 5) / 5.0;
                totalPopulation += populationForAgeGroup * proportion;
            } else {
                // If it's one of the middle age groups, just add the entire population of the age group
                totalPopulation += populationForAgeGroup;
            }
        }

        return totalPopulation;
    }


    public MatchStatsDTO generateMatchStats(PersonPreference preference) {
        Gender genderPreference = preference.getGenderPreference();
        Race racePreference = preference.getRacePreference();
        int agePreferenceLow = preference.getAgeRangeLower();
        int agePreferenceHigh = preference.getAgeRangeUpper();
        boolean hasChildren = preference.isHasChildren();
        String countyPreference = preference.getCountyPreference();
        int heightPreferenceLow = preference.getHeightRangeLower();
        int heightPreferenceHigh = preference.getHeightRangeUpper();
        States statePreference = preference.getStatePreference();

        int marriedRate = calculateMarriageRateByAge(agePreferenceLow, agePreferenceHigh);
        int statePop = this.sdr.findById(statePreference.toString()).get().getPopulation2020();
        logger.info("Married Rate: " + marriedRate);
        logger.info("State Population: " + statePop);


        CountyDataKey countyDataKey = new CountyDataKey(statePreference.toString(), countyPreference, 0);

        Optional<StateData> stateData = this.sdr.findById(statePreference.toString());
        Optional<CountyData> countyDataTotal = this.cdr.findById(countyDataKey);

        int totalCountyPopulation = countyDataTotal.get().getTotPop(); // total population of the county preference
        int totalPopOfAgeRangeInCounty = calculateTotalPopOfAgeRangeInCounty(genderPreference, agePreferenceLow, agePreferenceHigh, statePreference.toString(), countyPreference); // total population of all people within preferred age range in county
        double heightPreferenceProp = calculateHeightProportion(genderPreference, agePreferenceLow, agePreferenceHigh, heightPreferenceLow, heightPreferenceHigh); // total proportion of people with your gender preference and age preference and height preference
        int totalMalePopulationCounty = this.cdr.findByKeyStateAndKeyCountyAndKeyAgeGrp(statePreference.toString(), countyPreference, 0).get().getMalePop();
        int totalFemalePopulationCounty = this.cdr.findByKeyStateAndKeyCountyAndKeyAgeGrp(statePreference.toString(), countyPreference, 0).get().getFemalePop();


        MatchStatsDTO matchStats = new MatchStatsDTO();
        matchStats.setStatePop(statePop);
        matchStats.setCountyPop(totalCountyPopulation);
        matchStats.setHeightPreferenceProp(heightPreferenceProp);

        matchStats.setGenderPreferenceCountyPopulation(Objects.equals(genderPreference.toString(), "MALE") ? totalMalePopulationCounty : totalFemalePopulationCounty);

        return matchStats;
    }
}