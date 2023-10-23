package com.example.chancesInsight.model;

import com.example.chancesInsight.model.keys.CountyDataKey;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "county_data")
public class CountyData {

    @EmbeddedId
    private CountyDataKey key;
    @Column(name = "age_grp", insertable=false, updatable=false)
    private int ageGrp;
    @Column(name = "tot_pop")
    private int totPop;
    @Column(name = "tot_male")
    private int malePop;
    @Column(name = "tot_female")
    private int femalePop;
    @Column(name = "male_prop")
    private double maleProp;
    @Column(name = "female_prop")
    private double femaleProp;

    public int getAgeGrp() {
        return ageGrp;
    }

    public void setAgeGrp(int ageGrp) {
        this.ageGrp = ageGrp;
    }

    public int getTotPop() {
        return totPop;
    }

    public void setTotPop(int totPop) {
        this.totPop = totPop;
    }

    public int getMalePop() {
        return malePop;
    }

    public void setMalePop(int malePop) {
        this.malePop = malePop;
    }

    public int getFemalePop() {
        return femalePop;
    }

    public void setFemalePop(int femalePop) {
        this.femalePop = femalePop;
    }

    public double getMaleProp() {
        return maleProp;
    }

    public void setMaleProp(double maleProp) {
        this.maleProp = maleProp;
    }

    public double getFemaleProp() {
        return femaleProp;
    }

    public void setFemaleProp(double femaleProp) {
        this.femaleProp = femaleProp;
    }

    public CountyDataKey getId() {
        return key;
    }

    public void setId(CountyDataKey id) {
        this.key = id;
    }
}
