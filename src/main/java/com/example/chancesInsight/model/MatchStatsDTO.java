package com.example.chancesInsight.model;

public class MatchStatsDTO {
    // update later for more countries?
    private final int countryPop = 331449520;
    private final double countryMaleProp = 0.5051;
    private final double countryFemaleProp = 1 - countryMaleProp;

    private final int countryMalePop = (int) Math.round(countryPop * countryMaleProp);
    private final int countryFemalePop = (int) Math.round(countryPop * countryFemaleProp);


    private int statePop;
    private double stateMaleProp;
    private double stateFemaleProp = 1 - stateMaleProp;
    private int stateMalePop = (int) Math.round(statePop * stateMaleProp);
    private int stateFemalePop = (int) Math.round(statePop * stateFemaleProp);

    private int countyPop;
    private double countyGenderPreferenceProp;
    private int countyGenderPreferencePop;

    private int totalPopOfAgeRangeInCounty;

    private double heightPreferenceAgePreferenceProp;

    private int stateMalePopOver18;
    private int stateFemalePopOver18;

    private double agePreferenceMarriedProp;
    private double agePreferenceUnmarriedProp;
    private int ageGenderPreferenceMarriedPop;

    private int countyAgeGenderHeightPreferenceUnmarriedOver18Pop;

    private double countyHeightAgePreferenceProp;

    private int countyMalePop;
    private int countyFemalePop;



    public int getCountryPop() {
        return countryPop;
    }

    public double getCountryMaleProp() {
        return countryMaleProp;
    }

    public double getCountryFemaleProp() {
        return countryFemaleProp;
    }

    public int getCountryMalePop() {
        return countryMalePop;
    }

    public int getCountryFemalePop() {
        return countryFemalePop;
    }

    public int getStatePop() {
        return statePop;
    }

    public void setStatePop(int statePop) {
        this.statePop = statePop;
    }

    public double getStateMaleProp() {
        return stateMaleProp;
    }

    public void setStateMaleProp(double stateMaleProp) {
        this.stateMaleProp = stateMaleProp;
    }

    public double getStateFemaleProp() {
        return stateFemaleProp;
    }

    public void setStateFemaleProp(double stateFemaleProp) {
        this.stateFemaleProp = stateFemaleProp;
    }

    public int getStateMalePop() {
        return stateMalePop;
    }

    public void setStateMalePop(int stateMalePop) {
        this.stateMalePop = stateMalePop;
    }

    public int getStateFemalePop() {
        return stateFemalePop;
    }

    public void setStateFemalePop(int stateFemalePop) {
        this.stateFemalePop = stateFemalePop;
    }

    public int getCountyPop() {
        return countyPop;
    }

    public void setCountyPop(int countyPop) {
        this.countyPop = countyPop;
    }

    public double getHeightPreferenceAgePreferenceProp() {
        return heightPreferenceAgePreferenceProp;
    }

    public void setHeightPreferenceAgePreferenceProp(double heightPreferenceAgePrefernceProp) {
        this.heightPreferenceAgePreferenceProp = heightPreferenceAgePrefernceProp;
    }


    public double getCountyGenderPreferenceProp() {
        return countyGenderPreferenceProp;
    }

    public void setCountyGenderPreferenceProp(double countyGenderPreferenceProp) {
        this.countyGenderPreferenceProp = countyGenderPreferenceProp;
    }

    public int getCountyGenderPreferencePop() {
        return countyGenderPreferencePop;
    }

    public void setCountyGenderPreferencePop(int countyGenderPreferencePop) {
        this.countyGenderPreferencePop = countyGenderPreferencePop;
    }

    public int getTotalPopOfAgeRangeInCounty() {
        return totalPopOfAgeRangeInCounty;
    }

    public void setTotalPopOfAgeRangeInCounty(int totalPopOfAgeRangeInCounty) {
        this.totalPopOfAgeRangeInCounty = totalPopOfAgeRangeInCounty;
    }

    public int getStateMalePopOver18() {
        return stateMalePopOver18;
    }

    public void setStateMalePopOver18(int stateMalePopOver18) {
        this.stateMalePopOver18 = stateMalePopOver18;
    }

    public int getStateFemalePopOver18() {
        return stateFemalePopOver18;
    }

    public void setStateFemalePopOver18(int stateFemalePopOver18) {
        this.stateFemalePopOver18 = stateFemalePopOver18;
    }

    public double getAgePreferenceMarriedProp() {
        return agePreferenceMarriedProp;
    }

    public void setAgePreferenceMarriedProp(double agePreferenceMarriedProp) {
        this.agePreferenceMarriedProp = agePreferenceMarriedProp;
    }

    public int getAgeGenderPreferenceMarriedPop() {
        return ageGenderPreferenceMarriedPop;
    }

    public void setAgeGenderPreferenceMarriedPop(int ageGenderPreferenceMarriedPop) {
        this.ageGenderPreferenceMarriedPop = ageGenderPreferenceMarriedPop;
    }


    public int getCountyAgeGenderHeightPreferenceUnmarriedOver18Pop() {
        return countyAgeGenderHeightPreferenceUnmarriedOver18Pop;
    }

    public void setCountyAgeGenderHeightPreferenceUnmarriedPop(int countyAgeGenderHeightPreferenceUnmarriedOver18Pop) {
        this.countyAgeGenderHeightPreferenceUnmarriedOver18Pop = countyAgeGenderHeightPreferenceUnmarriedOver18Pop;
    }

    public double getAgePreferenceUnmarriedProp() {
        return agePreferenceUnmarriedProp;
    }

    public void setAgePreferenceUnmarriedProp(double agePreferenceUnmarriedProp) {
        this.agePreferenceUnmarriedProp = agePreferenceUnmarriedProp;
    }

    public double getCountyHeightAgePreferenceProp() {
        return countyHeightAgePreferenceProp;
    }

    public void setCountyHeightAgePreferenceProp(double countyHeightAgePreferenceProp) {
        this.countyHeightAgePreferenceProp = countyHeightAgePreferenceProp;
    }

    public int getCountyMalePop() {
        return countyMalePop;
    }

    public void setCountyMalePop(int countyMalePop) {
        this.countyMalePop = countyMalePop;
    }

    public int getCountyFemalePop() {
        return countyFemalePop;
    }

    public void setCountyFemalePop(int countyFemalePop) {
        this.countyFemalePop = countyFemalePop;
    }
}
