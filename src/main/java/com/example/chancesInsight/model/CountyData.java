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

    @Column(name = "stname")
    private String stateName;

    @Column(name = "ctyname", insertable=false, updatable=false)
    private String countyName;

    @Column(name = "year")
    private int year;

    @Column(name = "wa_male")
    private int whiteAloneMale;

    @Column(name = "wa_female")
    private int whiteAloneFemale;

    @Column(name = "ba_male")
    private int blackOrAfricanAmericanAloneMale;

    @Column(name = "ba_female")
    private int blackOrAfricanAmericanAloneFemale;

    @Column(name = "ia_male")
    private int americanIndianAndAlaskaNativeAloneMale;

    @Column(name = "ia_female")
    private int americanIndianAndAlaskaNativeAloneFemale;

    @Column(name = "aa_male")
    private int asianAloneMale;

    @Column(name = "aa_female")
    private int asianAloneFemale;

    @Column(name = "na_male")
    private int nativeHawaiianAndOtherPacificIslanderAloneMale;

    @Column(name = "na_female")
    private int nativeHawaiianAndOtherPacificIslanderAloneFemale;

    @Column(name = "tom_male")
    private int twoOrMoreRacesMale;

    @Column(name = "tom_female")
    private int twoOrMoreRacesFemale;

    @Column(name = "wac_male")
    private int whiteAloneOrInCombinationMale;

    @Column(name = "wac_female")
    private int whiteAloneOrInCombinationFemale;

    @Column(name = "bac_male")
    private int blackOrAfricanAmericanAloneOrInCombinationMale;

    @Column(name = "bac_female")
    private int blackOrAfricanAmericanAloneOrInCombinationFemale;

    @Column(name = "iac_male")
    private int americanIndianAndAlaskaNativeAloneOrInCombinationMale;

    @Column(name = "iac_female")
    private int americanIndianAndAlaskaNativeAloneOrInCombinationFemale;

    @Column(name = "aac_male")
    private int asianAloneOrInCombinationMale;

    @Column(name = "aac_female")
    private int asianAloneOrInCombinationFemale;

    @Column(name = "nac_male")
    private int nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;

    @Column(name = "nac_female")
    private int nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;

    @Column(name = "nh_male")
    private int notHispanicMale;

    @Column(name = "nh_female")
    private int notHispanicFemale;

    @Column(name = "nhwa_male")
    private int notHispanicWhiteAloneMale;

    @Column(name = "nhwa_female")
    private int notHispanicWhiteAloneFemale;

    @Column(name = "nhba_male")
    private int notHispanicBlackOrAfricanAmericanAloneMale;

    @Column(name = "nhba_female")
    private int notHispanicBlackOrAfricanAmericanAloneFemale;

    @Column(name = "nhia_male")
    private int notHispanicAmericanIndianAndAlaskaNativeAloneMale;

    @Column(name = "nhia_female")
    private int notHispanicAmericanIndianAndAlaskaNativeAloneFemale;

    @Column(name = "nhaa_male")
    private int notHispanicAsianAloneMale;

    @Column(name = "nhaa_female")
    private int notHispanicAsianAloneFemale;

    @Column(name = "nhna_male")
    private int notHispanicNativeHawaiianAndOtherPacificIslanderAloneMale;

    @Column(name = "nhna_female")
    private int notHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale;

    @Column(name = "nhtom_male")
    private int notHispanicTwoOrMoreRacesMale;

    @Column(name = "nhtom_female")
    private int notHispanicTwoOrMoreRacesFemale;

    @Column(name = "nhwac_male")
    private int notHispanicWhiteAloneOrInCombinationMale;

    @Column(name = "nhwac_female")
    private int notHispanicWhiteAloneOrInCombinationFemale;

    @Column(name = "nhbac_male")
    private int notHispanicBlackOrAfricanAmericanAloneOrInCombinationMale;

    @Column(name = "nhbac_female")
    private int notHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale;

    @Column(name = "nhiac_male")
    private int notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale;

    @Column(name = "nhiac_female")
    private int notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale;

    @Column(name = "nhaac_male")
    private int notHispanicAsianAloneOrInCombinationMale;

    @Column(name = "nhaac_female")
    private int notHispanicAsianAloneOrInCombinationFemale;

    @Column(name = "nhnac_male")
    private int notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;

    @Column(name = "nhnac_female")
    private int notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;

    @Column(name = "h_male")
    private int hispanicMale;

    @Column(name = "h_female")
    private int hispanicFemale;

    @Column(name = "hwa_male")
    private int hispanicWhiteAloneMale;

    @Column(name = "hwa_female")
    private int hispanicWhiteAloneFemale;

    @Column(name = "hba_male")
    private int hispanicBlackOrAfricanAmericanAloneMale;

    @Column(name = "hba_female")
    private int hispanicBlackOrAfricanAmericanAloneFemale;

    @Column(name = "hia_male")
    private int hispanicAmericanIndianAndAlaskaNativeAloneMale;

    @Column(name = "hia_female")
    private int hispanicAmericanIndianAndAlaskaNativeAloneFemale;

    @Column(name = "haa_male")
    private int hispanicAsianAloneMale;

    @Column(name = "haa_female")
    private int hispanicAsianAloneFemale;

    @Column(name = "hna_male")
    private int hispanicNativeHawaiianAndOtherPacificIslanderAloneMale;

    @Column(name = "hna_female")
    private int hispanicNativeHawaiianAndOtherPacificIslanderAloneFemale;

    @Column(name = "htom_male")
    private int hispanicTwoOrMoreRacesMale;

    @Column(name = "htom_female")
    private int hispanicTwoOrMoreRacesFemale;

    @Column(name = "hwac_male")
    private int hispanicWhiteAloneOrInCombinationMale;

    @Column(name = "hwac_female")
    private int hispanicWhiteAloneOrInCombinationFemale;

    @Column(name = "hbac_male")
    private int hispanicBlackOrAfricanAmericanAloneOrInCombinationMale;

    @Column(name = "hbac_female")
    private int hispanicBlackOrAfricanAmericanAloneOrInCombinationFemale;

    @Column(name = "hiac_male")
    private int hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale;

    @Column(name = "hiac_female")
    private int hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale;

    @Column(name = "haac_male")
    private int hispanicAsianAloneOrInCombinationMale;

    @Column(name = "haac_female")
    private int hispanicAsianAloneOrInCombinationFemale;

    @Column(name = "hnac_male")
    private int hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;

    @Column(name = "hnac_female")
    private int hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;


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

    public CountyDataKey getKey() {
        return key;
    }

    public void setKey(CountyDataKey key) {
        this.key = key;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWhiteAloneMale() {
        return whiteAloneMale;
    }

    public void setWhiteAloneMale(int whiteAloneMale) {
        this.whiteAloneMale = whiteAloneMale;
    }

    public int getWhiteAloneFemale() {
        return whiteAloneFemale;
    }

    public void setWhiteAloneFemale(int whiteAloneFemale) {
        this.whiteAloneFemale = whiteAloneFemale;
    }

    public int getBlackOrAfricanAmericanAloneMale() {
        return blackOrAfricanAmericanAloneMale;
    }

    public void setBlackOrAfricanAmericanAloneMale(int blackOrAfricanAmericanAloneMale) {
        this.blackOrAfricanAmericanAloneMale = blackOrAfricanAmericanAloneMale;
    }

    public int getBlackOrAfricanAmericanAloneFemale() {
        return blackOrAfricanAmericanAloneFemale;
    }

    public void setBlackOrAfricanAmericanAloneFemale(int blackOrAfricanAmericanAloneFemale) {
        this.blackOrAfricanAmericanAloneFemale = blackOrAfricanAmericanAloneFemale;
    }

    public int getAmericanIndianAndAlaskaNativeAloneMale() {
        return americanIndianAndAlaskaNativeAloneMale;
    }

    public void setAmericanIndianAndAlaskaNativeAloneMale(int americanIndianAndAlaskaNativeAloneMale) {
        this.americanIndianAndAlaskaNativeAloneMale = americanIndianAndAlaskaNativeAloneMale;
    }

    public int getAmericanIndianAndAlaskaNativeAloneFemale() {
        return americanIndianAndAlaskaNativeAloneFemale;
    }

    public void setAmericanIndianAndAlaskaNativeAloneFemale(int americanIndianAndAlaskaNativeAloneFemale) {
        this.americanIndianAndAlaskaNativeAloneFemale = americanIndianAndAlaskaNativeAloneFemale;
    }

    public int getAsianAloneMale() {
        return asianAloneMale;
    }

    public void setAsianAloneMale(int asianAloneMale) {
        this.asianAloneMale = asianAloneMale;
    }

    public int getAsianAloneFemale() {
        return asianAloneFemale;
    }

    public void setAsianAloneFemale(int asianAloneFemale) {
        this.asianAloneFemale = asianAloneFemale;
    }

    public int getNativeHawaiianAndOtherPacificIslanderAloneMale() {
        return nativeHawaiianAndOtherPacificIslanderAloneMale;
    }

    public void setNativeHawaiianAndOtherPacificIslanderAloneMale(int nativeHawaiianAndOtherPacificIslanderAloneMale) {
        this.nativeHawaiianAndOtherPacificIslanderAloneMale = nativeHawaiianAndOtherPacificIslanderAloneMale;
    }

    public int getNativeHawaiianAndOtherPacificIslanderAloneFemale() {
        return nativeHawaiianAndOtherPacificIslanderAloneFemale;
    }

    public void setNativeHawaiianAndOtherPacificIslanderAloneFemale(int nativeHawaiianAndOtherPacificIslanderAloneFemale) {
        this.nativeHawaiianAndOtherPacificIslanderAloneFemale = nativeHawaiianAndOtherPacificIslanderAloneFemale;
    }

    public int getTwoOrMoreRacesMale() {
        return twoOrMoreRacesMale;
    }

    public void setTwoOrMoreRacesMale(int twoOrMoreRacesMale) {
        this.twoOrMoreRacesMale = twoOrMoreRacesMale;
    }

    public int getTwoOrMoreRacesFemale() {
        return twoOrMoreRacesFemale;
    }

    public void setTwoOrMoreRacesFemale(int twoOrMoreRacesFemale) {
        this.twoOrMoreRacesFemale = twoOrMoreRacesFemale;
    }

    public int getWhiteAloneOrInCombinationMale() {
        return whiteAloneOrInCombinationMale;
    }

    public void setWhiteAloneOrInCombinationMale(int whiteAloneOrInCombinationMale) {
        this.whiteAloneOrInCombinationMale = whiteAloneOrInCombinationMale;
    }

    public int getWhiteAloneOrInCombinationFemale() {
        return whiteAloneOrInCombinationFemale;
    }

    public void setWhiteAloneOrInCombinationFemale(int whiteAloneOrInCombinationFemale) {
        this.whiteAloneOrInCombinationFemale = whiteAloneOrInCombinationFemale;
    }

    public int getBlackOrAfricanAmericanAloneOrInCombinationMale() {
        return blackOrAfricanAmericanAloneOrInCombinationMale;
    }

    public void setBlackOrAfricanAmericanAloneOrInCombinationMale(int blackOrAfricanAmericanAloneOrInCombinationMale) {
        this.blackOrAfricanAmericanAloneOrInCombinationMale = blackOrAfricanAmericanAloneOrInCombinationMale;
    }

    public int getBlackOrAfricanAmericanAloneOrInCombinationFemale() {
        return blackOrAfricanAmericanAloneOrInCombinationFemale;
    }

    public void setBlackOrAfricanAmericanAloneOrInCombinationFemale(int blackOrAfricanAmericanAloneOrInCombinationFemale) {
        this.blackOrAfricanAmericanAloneOrInCombinationFemale = blackOrAfricanAmericanAloneOrInCombinationFemale;
    }

    public int getAmericanIndianAndAlaskaNativeAloneOrInCombinationMale() {
        return americanIndianAndAlaskaNativeAloneOrInCombinationMale;
    }

    public void setAmericanIndianAndAlaskaNativeAloneOrInCombinationMale(int americanIndianAndAlaskaNativeAloneOrInCombinationMale) {
        this.americanIndianAndAlaskaNativeAloneOrInCombinationMale = americanIndianAndAlaskaNativeAloneOrInCombinationMale;
    }

    public int getAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale() {
        return americanIndianAndAlaskaNativeAloneOrInCombinationFemale;
    }

    public void setAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale(int americanIndianAndAlaskaNativeAloneOrInCombinationFemale) {
        this.americanIndianAndAlaskaNativeAloneOrInCombinationFemale = americanIndianAndAlaskaNativeAloneOrInCombinationFemale;
    }

    public int getAsianAloneOrInCombinationMale() {
        return asianAloneOrInCombinationMale;
    }

    public void setAsianAloneOrInCombinationMale(int asianAloneOrInCombinationMale) {
        this.asianAloneOrInCombinationMale = asianAloneOrInCombinationMale;
    }

    public int getAsianAloneOrInCombinationFemale() {
        return asianAloneOrInCombinationFemale;
    }

    public void setAsianAloneOrInCombinationFemale(int asianAloneOrInCombinationFemale) {
        this.asianAloneOrInCombinationFemale = asianAloneOrInCombinationFemale;
    }

    public int getNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale() {
        return nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;
    }

    public void setNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale(int nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale) {
        this.nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale = nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;
    }

    public int getNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale() {
        return nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;
    }

    public void setNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale(int nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale) {
        this.nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale = nativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;
    }

    public int getNotHispanicMale() {
        return notHispanicMale;
    }

    public void setNotHispanicMale(int notHispanicMale) {
        this.notHispanicMale = notHispanicMale;
    }

    public int getNotHispanicFemale() {
        return notHispanicFemale;
    }

    public void setNotHispanicFemale(int notHispanicFemale) {
        this.notHispanicFemale = notHispanicFemale;
    }

    public int getNotHispanicWhiteAloneMale() {
        return notHispanicWhiteAloneMale;
    }

    public void setNotHispanicWhiteAloneMale(int notHispanicWhiteAloneMale) {
        this.notHispanicWhiteAloneMale = notHispanicWhiteAloneMale;
    }

    public int getNotHispanicWhiteAloneFemale() {
        return notHispanicWhiteAloneFemale;
    }

    public void setNotHispanicWhiteAloneFemale(int notHispanicWhiteAloneFemale) {
        this.notHispanicWhiteAloneFemale = notHispanicWhiteAloneFemale;
    }

    public int getNotHispanicBlackOrAfricanAmericanAloneMale() {
        return notHispanicBlackOrAfricanAmericanAloneMale;
    }

    public void setNotHispanicBlackOrAfricanAmericanAloneMale(int notHispanicBlackOrAfricanAmericanAloneMale) {
        this.notHispanicBlackOrAfricanAmericanAloneMale = notHispanicBlackOrAfricanAmericanAloneMale;
    }

    public int getNotHispanicBlackOrAfricanAmericanAloneFemale() {
        return notHispanicBlackOrAfricanAmericanAloneFemale;
    }

    public void setNotHispanicBlackOrAfricanAmericanAloneFemale(int notHispanicBlackOrAfricanAmericanAloneFemale) {
        this.notHispanicBlackOrAfricanAmericanAloneFemale = notHispanicBlackOrAfricanAmericanAloneFemale;
    }

    public int getNotHispanicAmericanIndianAndAlaskaNativeAloneMale() {
        return notHispanicAmericanIndianAndAlaskaNativeAloneMale;
    }

    public void setNotHispanicAmericanIndianAndAlaskaNativeAloneMale(int notHispanicAmericanIndianAndAlaskaNativeAloneMale) {
        this.notHispanicAmericanIndianAndAlaskaNativeAloneMale = notHispanicAmericanIndianAndAlaskaNativeAloneMale;
    }

    public int getNotHispanicAmericanIndianAndAlaskaNativeAloneFemale() {
        return notHispanicAmericanIndianAndAlaskaNativeAloneFemale;
    }

    public void setNotHispanicAmericanIndianAndAlaskaNativeAloneFemale(int notHispanicAmericanIndianAndAlaskaNativeAloneFemale) {
        this.notHispanicAmericanIndianAndAlaskaNativeAloneFemale = notHispanicAmericanIndianAndAlaskaNativeAloneFemale;
    }

    public int getNotHispanicAsianAloneMale() {
        return notHispanicAsianAloneMale;
    }

    public void setNotHispanicAsianAloneMale(int notHispanicAsianAloneMale) {
        this.notHispanicAsianAloneMale = notHispanicAsianAloneMale;
    }

    public int getNotHispanicAsianAloneFemale() {
        return notHispanicAsianAloneFemale;
    }

    public void setNotHispanicAsianAloneFemale(int notHispanicAsianAloneFemale) {
        this.notHispanicAsianAloneFemale = notHispanicAsianAloneFemale;
    }

    public int getNotHispanicNativeHawaiianAndOtherPacificIslanderAloneMale() {
        return notHispanicNativeHawaiianAndOtherPacificIslanderAloneMale;
    }

    public void setNotHispanicNativeHawaiianAndOtherPacificIslanderAloneMale(int notHispanicNativeHawaiianAndOtherPacificIslanderAloneMale) {
        this.notHispanicNativeHawaiianAndOtherPacificIslanderAloneMale = notHispanicNativeHawaiianAndOtherPacificIslanderAloneMale;
    }

    public int getNotHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale() {
        return notHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale;
    }

    public void setNotHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale(int notHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale) {
        this.notHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale = notHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale;
    }

    public int getNotHispanicTwoOrMoreRacesMale() {
        return notHispanicTwoOrMoreRacesMale;
    }

    public void setNotHispanicTwoOrMoreRacesMale(int notHispanicTwoOrMoreRacesMale) {
        this.notHispanicTwoOrMoreRacesMale = notHispanicTwoOrMoreRacesMale;
    }

    public int getNotHispanicTwoOrMoreRacesFemale() {
        return notHispanicTwoOrMoreRacesFemale;
    }

    public void setNotHispanicTwoOrMoreRacesFemale(int notHispanicTwoOrMoreRacesFemale) {
        this.notHispanicTwoOrMoreRacesFemale = notHispanicTwoOrMoreRacesFemale;
    }

    public int getNotHispanicWhiteAloneOrInCombinationMale() {
        return notHispanicWhiteAloneOrInCombinationMale;
    }

    public void setNotHispanicWhiteAloneOrInCombinationMale(int notHispanicWhiteAloneOrInCombinationMale) {
        this.notHispanicWhiteAloneOrInCombinationMale = notHispanicWhiteAloneOrInCombinationMale;
    }

    public int getNotHispanicWhiteAloneOrInCombinationFemale() {
        return notHispanicWhiteAloneOrInCombinationFemale;
    }

    public void setNotHispanicWhiteAloneOrInCombinationFemale(int notHispanicWhiteAloneOrInCombinationFemale) {
        this.notHispanicWhiteAloneOrInCombinationFemale = notHispanicWhiteAloneOrInCombinationFemale;
    }

    public int getNotHispanicBlackOrAfricanAmericanAloneOrInCombinationMale() {
        return notHispanicBlackOrAfricanAmericanAloneOrInCombinationMale;
    }

    public void setNotHispanicBlackOrAfricanAmericanAloneOrInCombinationMale(int notHispanicBlackOrAfricanAmericanAloneOrInCombinationMale) {
        this.notHispanicBlackOrAfricanAmericanAloneOrInCombinationMale = notHispanicBlackOrAfricanAmericanAloneOrInCombinationMale;
    }

    public int getNotHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale() {
        return notHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale;
    }

    public void setNotHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale(int notHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale) {
        this.notHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale = notHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale;
    }

    public int getNotHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale() {
        return notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale;
    }

    public void setNotHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale(int notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale) {
        this.notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale = notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale;
    }

    public int getNotHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale() {
        return notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale;
    }

    public void setNotHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale(int notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale) {
        this.notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale = notHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale;
    }

    public int getNotHispanicAsianAloneOrInCombinationMale() {
        return notHispanicAsianAloneOrInCombinationMale;
    }

    public void setNotHispanicAsianAloneOrInCombinationMale(int notHispanicAsianAloneOrInCombinationMale) {
        this.notHispanicAsianAloneOrInCombinationMale = notHispanicAsianAloneOrInCombinationMale;
    }

    public int getNotHispanicAsianAloneOrInCombinationFemale() {
        return notHispanicAsianAloneOrInCombinationFemale;
    }

    public void setNotHispanicAsianAloneOrInCombinationFemale(int notHispanicAsianAloneOrInCombinationFemale) {
        this.notHispanicAsianAloneOrInCombinationFemale = notHispanicAsianAloneOrInCombinationFemale;
    }

    public int getNotHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale() {
        return notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;
    }

    public void setNotHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale(int notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale) {
        this.notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale = notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;
    }

    public int getNotHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale() {
        return notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;
    }

    public void setNotHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale(int notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale) {
        this.notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale = notHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;
    }

    public int getHispanicMale() {
        return hispanicMale;
    }

    public void setHispanicMale(int hispanicMale) {
        this.hispanicMale = hispanicMale;
    }

    public int getHispanicFemale() {
        return hispanicFemale;
    }

    public void setHispanicFemale(int hispanicFemale) {
        this.hispanicFemale = hispanicFemale;
    }

    public int getHispanicWhiteAloneMale() {
        return hispanicWhiteAloneMale;
    }

    public void setHispanicWhiteAloneMale(int hispanicWhiteAloneMale) {
        this.hispanicWhiteAloneMale = hispanicWhiteAloneMale;
    }

    public int getHispanicWhiteAloneFemale() {
        return hispanicWhiteAloneFemale;
    }

    public void setHispanicWhiteAloneFemale(int hispanicWhiteAloneFemale) {
        this.hispanicWhiteAloneFemale = hispanicWhiteAloneFemale;
    }

    public int getHispanicBlackOrAfricanAmericanAloneMale() {
        return hispanicBlackOrAfricanAmericanAloneMale;
    }

    public void setHispanicBlackOrAfricanAmericanAloneMale(int hispanicBlackOrAfricanAmericanAloneMale) {
        this.hispanicBlackOrAfricanAmericanAloneMale = hispanicBlackOrAfricanAmericanAloneMale;
    }

    public int getHispanicBlackOrAfricanAmericanAloneFemale() {
        return hispanicBlackOrAfricanAmericanAloneFemale;
    }

    public void setHispanicBlackOrAfricanAmericanAloneFemale(int hispanicBlackOrAfricanAmericanAloneFemale) {
        this.hispanicBlackOrAfricanAmericanAloneFemale = hispanicBlackOrAfricanAmericanAloneFemale;
    }

    public int getHispanicAmericanIndianAndAlaskaNativeAloneMale() {
        return hispanicAmericanIndianAndAlaskaNativeAloneMale;
    }

    public void setHispanicAmericanIndianAndAlaskaNativeAloneMale(int hispanicAmericanIndianAndAlaskaNativeAloneMale) {
        this.hispanicAmericanIndianAndAlaskaNativeAloneMale = hispanicAmericanIndianAndAlaskaNativeAloneMale;
    }

    public int getHispanicAmericanIndianAndAlaskaNativeAloneFemale() {
        return hispanicAmericanIndianAndAlaskaNativeAloneFemale;
    }

    public void setHispanicAmericanIndianAndAlaskaNativeAloneFemale(int hispanicAmericanIndianAndAlaskaNativeAloneFemale) {
        this.hispanicAmericanIndianAndAlaskaNativeAloneFemale = hispanicAmericanIndianAndAlaskaNativeAloneFemale;
    }

    public int getHispanicAsianAloneMale() {
        return hispanicAsianAloneMale;
    }

    public void setHispanicAsianAloneMale(int hispanicAsianAloneMale) {
        this.hispanicAsianAloneMale = hispanicAsianAloneMale;
    }

    public int getHispanicAsianAloneFemale() {
        return hispanicAsianAloneFemale;
    }

    public void setHispanicAsianAloneFemale(int hispanicAsianAloneFemale) {
        this.hispanicAsianAloneFemale = hispanicAsianAloneFemale;
    }

    public int getHispanicNativeHawaiianAndOtherPacificIslanderAloneMale() {
        return hispanicNativeHawaiianAndOtherPacificIslanderAloneMale;
    }

    public void setHispanicNativeHawaiianAndOtherPacificIslanderAloneMale(int hispanicNativeHawaiianAndOtherPacificIslanderAloneMale) {
        this.hispanicNativeHawaiianAndOtherPacificIslanderAloneMale = hispanicNativeHawaiianAndOtherPacificIslanderAloneMale;
    }

    public int getHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale() {
        return hispanicNativeHawaiianAndOtherPacificIslanderAloneFemale;
    }

    public void setHispanicNativeHawaiianAndOtherPacificIslanderAloneFemale(int hispanicNativeHawaiianAndOtherPacificIslanderAloneFemale) {
        this.hispanicNativeHawaiianAndOtherPacificIslanderAloneFemale = hispanicNativeHawaiianAndOtherPacificIslanderAloneFemale;
    }

    public int getHispanicTwoOrMoreRacesMale() {
        return hispanicTwoOrMoreRacesMale;
    }

    public void setHispanicTwoOrMoreRacesMale(int hispanicTwoOrMoreRacesMale) {
        this.hispanicTwoOrMoreRacesMale = hispanicTwoOrMoreRacesMale;
    }

    public int getHispanicTwoOrMoreRacesFemale() {
        return hispanicTwoOrMoreRacesFemale;
    }

    public void setHispanicTwoOrMoreRacesFemale(int hispanicTwoOrMoreRacesFemale) {
        this.hispanicTwoOrMoreRacesFemale = hispanicTwoOrMoreRacesFemale;
    }

    public int getHispanicWhiteAloneOrInCombinationMale() {
        return hispanicWhiteAloneOrInCombinationMale;
    }

    public void setHispanicWhiteAloneOrInCombinationMale(int hispanicWhiteAloneOrInCombinationMale) {
        this.hispanicWhiteAloneOrInCombinationMale = hispanicWhiteAloneOrInCombinationMale;
    }

    public int getHispanicWhiteAloneOrInCombinationFemale() {
        return hispanicWhiteAloneOrInCombinationFemale;
    }

    public void setHispanicWhiteAloneOrInCombinationFemale(int hispanicWhiteAloneOrInCombinationFemale) {
        this.hispanicWhiteAloneOrInCombinationFemale = hispanicWhiteAloneOrInCombinationFemale;
    }

    public int getHispanicBlackOrAfricanAmericanAloneOrInCombinationMale() {
        return hispanicBlackOrAfricanAmericanAloneOrInCombinationMale;
    }

    public void setHispanicBlackOrAfricanAmericanAloneOrInCombinationMale(int hispanicBlackOrAfricanAmericanAloneOrInCombinationMale) {
        this.hispanicBlackOrAfricanAmericanAloneOrInCombinationMale = hispanicBlackOrAfricanAmericanAloneOrInCombinationMale;
    }

    public int getHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale() {
        return hispanicBlackOrAfricanAmericanAloneOrInCombinationFemale;
    }

    public void setHispanicBlackOrAfricanAmericanAloneOrInCombinationFemale(int hispanicBlackOrAfricanAmericanAloneOrInCombinationFemale) {
        this.hispanicBlackOrAfricanAmericanAloneOrInCombinationFemale = hispanicBlackOrAfricanAmericanAloneOrInCombinationFemale;
    }

    public int getHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale() {
        return hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale;
    }

    public void setHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale(int hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale) {
        this.hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale = hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationMale;
    }

    public int getHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale() {
        return hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale;
    }

    public void setHispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale(int hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale) {
        this.hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale = hispanicAmericanIndianAndAlaskaNativeAloneOrInCombinationFemale;
    }

    public int getHispanicAsianAloneOrInCombinationMale() {
        return hispanicAsianAloneOrInCombinationMale;
    }

    public void setHispanicAsianAloneOrInCombinationMale(int hispanicAsianAloneOrInCombinationMale) {
        this.hispanicAsianAloneOrInCombinationMale = hispanicAsianAloneOrInCombinationMale;
    }

    public int getHispanicAsianAloneOrInCombinationFemale() {
        return hispanicAsianAloneOrInCombinationFemale;
    }

    public void setHispanicAsianAloneOrInCombinationFemale(int hispanicAsianAloneOrInCombinationFemale) {
        this.hispanicAsianAloneOrInCombinationFemale = hispanicAsianAloneOrInCombinationFemale;
    }

    public int getHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale() {
        return hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;
    }

    public void setHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale(int hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale) {
        this.hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale = hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationMale;
    }

    public int getHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale() {
        return hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;
    }

    public void setHispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale(int hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale) {
        this.hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale = hispanicNativeHawaiianAndOtherPacificIslanderAloneOrInCombinationFemale;
    }
}
