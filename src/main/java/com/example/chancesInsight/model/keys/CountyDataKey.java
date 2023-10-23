package com.example.chancesInsight.model.keys;

import com.example.chancesInsight.model.States;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountyDataKey implements Serializable {

    @Column(name = "st_abb")
    private String state;
    @Column(name = "ctyname")
    private String county;
    @Column(name = "age_grp")
    private int ageGrp;

    public CountyDataKey() {}

    public CountyDataKey(String state, String county, int ageGrp) {
        this.state = state;
        this.county = county;
        this.ageGrp = ageGrp;
    }

    // Standard getters and setters

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getAgeGrp() {
        return ageGrp;
    }

    public void setAgegrp(int agegrp) {
        this.ageGrp = agegrp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountyDataKey that = (CountyDataKey) o;
        return ageGrp == that.ageGrp &&
                Objects.equals(state, that.state) &&
                Objects.equals(county, that.county);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, county, ageGrp);
    }
}