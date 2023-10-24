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
    private double countyMaleProp;
    private double countyFemaleProp = 1 - countyMaleProp;
    private int countyMalePop = (int) Math.round(countyPop * countyMaleProp);
    private int countyFemalePop = (int) Math.round(statePop * stateFemaleProp);

    private double heightPreferenceProp;
    private int genderPreferenceCountyPopulation;

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

    public double getCountyMaleProp() {
        return countyMaleProp;
    }

    public void setCountyMaleProp(double countyMaleProp) {
        this.countyMaleProp = countyMaleProp;
    }

    public double getCountyFemaleProp() {
        return countyFemaleProp;
    }

    public void setCountyFemaleProp(double countyFemaleProp) {
        this.countyFemaleProp = countyFemaleProp;
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

    public double getHeightPreferenceProp() {
        return heightPreferenceProp;
    }

    public void setHeightPreferenceProp(double heightPreferenceProp) {
        this.heightPreferenceProp = heightPreferenceProp;
    }

    public int getGenderPreferenceCountyPopulation() {
        return genderPreferenceCountyPopulation;
    }

    public void setGenderPreferenceCountyPopulation(int genderPreferenceCountyPopulation) {
        this.genderPreferenceCountyPopulation = genderPreferenceCountyPopulation;
    }
}
