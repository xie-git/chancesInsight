package com.example.chancesInsight.model;

import jakarta.persistence.*;

@Entity
@Table(name = "person_preference")
public class PersonPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender_preference")
    private Gender genderPreference;

    @Column(name = "age_range_lower", nullable = false)
    private int ageRangeLower;

    @Column(name = "age_range_upper", nullable = false)
    private int ageRangeUpper;

    @Column(name = "has_children", nullable = false)
    private boolean hasChildren;

    @Enumerated(EnumType.STRING)
    @Column(name = "race_preference", nullable = false)
    private Race racePreference;

    @Column(name = "height_range_lower", nullable = false)
    private int heightRangeLower;

    @Column(name = "height_range_upper", nullable = false)
    private int heightRangeUpper;

    @Column(name = "income_range_lower", nullable = false)
    private int incomeRangeLower;

    @Column(name = "income_range_upper", nullable = false)
    private int incomeRangeUpper;

    @Enumerated(EnumType.STRING)
    @Column(name = "state_preference")
    private States statePreference;

    @Column(name = "county_preference")
    private String countyPreference;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAgeRangeLower() {
        return ageRangeLower;
    }

    public void setAgeRangeLower(int ageRangeLower) {
        this.ageRangeLower = ageRangeLower;
    }

    public int getAgeRangeUpper() {
        return ageRangeUpper;
    }

    public void setAgeRangeUpper(int ageRangeUpper) {
        this.ageRangeUpper = ageRangeUpper;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public Race getRacePreference() {
        return racePreference;
    }

    public void setRacePreference(Race racePreference) {
        this.racePreference = racePreference;
    }

    public int getHeightRangeLower() {
        return heightRangeLower;
    }

    public void setHeightRangeLower(int heightRangeLower) {
        this.heightRangeLower = heightRangeLower;
    }

    public int getHeightRangeUpper() {
        return heightRangeUpper;
    }

    public void setHeightRangeUpper(int heightRangeUpper) {
        this.heightRangeUpper = heightRangeUpper;
    }

    public int getIncomeRangeLower() {
        return incomeRangeLower;
    }

    public void setIncomeRangeLower(int incomeRangeLower) {
        this.incomeRangeLower = incomeRangeLower;
    }

    public int getIncomeRangeUpper() {
        return incomeRangeUpper;
    }

    public void setIncomeRangeUpper(int incomeRangeUpper) {
        this.incomeRangeUpper = incomeRangeUpper;
    }

    public States getStatePreference() {
        return statePreference;
    }

    public void setStatePreference(States statePreference) {
        this.statePreference = statePreference;
    }

    public Gender getGenderPreference() {
        return genderPreference;
    }

    public void setGenderPreference(Gender gender) {
        this.genderPreference = gender;
    }

    public String getCountyPreference() {
        return countyPreference;
    }

    public void setCountyPreference(String countyPreference) {
        this.countyPreference = countyPreference;
    }
}
