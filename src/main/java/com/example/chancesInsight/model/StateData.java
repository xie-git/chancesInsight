package com.example.chancesInsight.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity
@Table(name = "state_demographics")
public class StateData {

    @Column(name = "State")
    private String state;

    @Column(name = "age_percent_under_18_years")
    private Double agePercentUnder18Years;

    @Column(name = "ethnicities_white_alone")
    private Double ethnicitiesWhiteAlone;

    @Column(name = "ethnicities_black_alone")
    private Double ethnicitiesBlackAlone;

    @Column(name = "ethnicities_american_indian_and_alaska_native_alone")
    private Double ethnicitiesAmericanIndianAndAlaskaNativeAlone;

    @Column(name = "ethnicities_asian_alone")
    private Double ethnicitiesAsianAlone;

    @Column(name = "ethnicities_native_hawaiian_and_other_pacific_islander_alone")
    private Double ethnicitiesNativeHawaiianAndOtherPacificIslanderAlone;

    @Column(name = "ethnicities_two_or_more_races")
    private Double ethnicitiesTwoOrMoreRaces;

    @Column(name = "ethnicities_hispanic_or_latino")
    private Double ethnicitiesHispanicOrLatino;

    @Column(name = "housing_homeownership_rate")
    private Double housingHomeownershipRate;

    @Column(name = "income_median_household_income")
    private String incomeMedianHouseholdIncome;

    @Column(name = "population_2020")
    private Integer population2020;

    @Id
    @Column(name = "st_abb")
    private String stAbb;

    @Column(name = "miscellaneous_percent_female")
    private double percentFemale;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getAgePercentUnder18Years() {
        return agePercentUnder18Years;
    }

    public void setAgePercentUnder18Years(Double agePercentUnder18Years) {
        this.agePercentUnder18Years = agePercentUnder18Years;
    }

    public Double getEthnicitiesWhiteAlone() {
        return ethnicitiesWhiteAlone;
    }

    public void setEthnicitiesWhiteAlone(Double ethnicitiesWhiteAlone) {
        this.ethnicitiesWhiteAlone = ethnicitiesWhiteAlone;
    }

    public Double getEthnicitiesBlackAlone() {
        return ethnicitiesBlackAlone;
    }

    public void setEthnicitiesBlackAlone(Double ethnicitiesBlackAlone) {
        this.ethnicitiesBlackAlone = ethnicitiesBlackAlone;
    }

    public Double getEthnicitiesAmericanIndianAndAlaskaNativeAlone() {
        return ethnicitiesAmericanIndianAndAlaskaNativeAlone;
    }

    public void setEthnicitiesAmericanIndianAndAlaskaNativeAlone(Double ethnicitiesAmericanIndianAndAlaskaNativeAlone) {
        this.ethnicitiesAmericanIndianAndAlaskaNativeAlone = ethnicitiesAmericanIndianAndAlaskaNativeAlone;
    }

    public Double getEthnicitiesAsianAlone() {
        return ethnicitiesAsianAlone;
    }

    public void setEthnicitiesAsianAlone(Double ethnicitiesAsianAlone) {
        this.ethnicitiesAsianAlone = ethnicitiesAsianAlone;
    }

    public Double getEthnicitiesNativeHawaiianAndOtherPacificIslanderAlone() {
        return ethnicitiesNativeHawaiianAndOtherPacificIslanderAlone;
    }

    public void setEthnicitiesNativeHawaiianAndOtherPacificIslanderAlone(Double ethnicitiesNativeHawaiianAndOtherPacificIslanderAlone) {
        this.ethnicitiesNativeHawaiianAndOtherPacificIslanderAlone = ethnicitiesNativeHawaiianAndOtherPacificIslanderAlone;
    }

    public Double getEthnicitiesTwoOrMoreRaces() {
        return ethnicitiesTwoOrMoreRaces;
    }

    public void setEthnicitiesTwoOrMoreRaces(Double ethnicitiesTwoOrMoreRaces) {
        this.ethnicitiesTwoOrMoreRaces = ethnicitiesTwoOrMoreRaces;
    }

    public Double getEthnicitiesHispanicOrLatino() {
        return ethnicitiesHispanicOrLatino;
    }

    public void setEthnicitiesHispanicOrLatino(Double ethnicitiesHispanicOrLatino) {
        this.ethnicitiesHispanicOrLatino = ethnicitiesHispanicOrLatino;
    }

    public Double getHousingHomeownershipRate() {
        return housingHomeownershipRate;
    }

    public void setHousingHomeownershipRate(Double housingHomeownershipRate) {
        this.housingHomeownershipRate = housingHomeownershipRate;
    }

    public String getIncomeMedianHouseholdIncome() {
        return incomeMedianHouseholdIncome;
    }

    public void setIncomeMedianHouseholdIncome(String incomeMedianHouseholdIncome) {
        this.incomeMedianHouseholdIncome = incomeMedianHouseholdIncome;
    }

    public Integer getPopulation2020() {
        return population2020;
    }

    public void setPopulation2020(Integer population2020) {
        this.population2020 = population2020;
    }

    public String getStAbb() {
        return stAbb;
    }

    public void setStAbb(String stAbb) {
        this.stAbb = stAbb;
    }

    public double getPercentFemale() {
        return percentFemale;
    }

    public void setPercentFemale(double percentFemale) {
        this.percentFemale = percentFemale;
    }
}
