package com.example.chancesInsight.model;

public class MatchStatsDTO {
    // update later for more countries?
    private final int countryPop = 331449520;
    private final double countryMaleProp = 0.5051;
    private final double countryFemaleProp = 1 - countryMaleProp;



    private int statePop;
    private double stateMaleProp;
    private double stateFemaleProp = 1 - stateMaleProp;
    private int stateMalePop = (int) Math.round(statePop * stateMaleProp);
    private int stateFemalePop = (int) Math.round(statePop * stateFemaleProp);

    private double countyPop;
    private double countyMaleProp;








}
