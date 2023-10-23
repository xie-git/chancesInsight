package com.example.chancesInsight.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_height_demographics")
public class HeightDemographics {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "gender")
    private String gender;

    @Column(name = "height_in_inches")
    private Integer heightInInches;

    @Column(name = "height_20_29")
    private Double height20_29;

    @Column(name = "height_30_39")
    private Double height30_39;

    @Column(name = "height_40_49")
    private Double height40_49;

    @Column(name = "height_50_59")
    private Double height50_59;

    @Column(name = "height_60_69")
    private Double height60_69;

    @Column(name = "height_70_79")
    private Double height70_79;

    // Constructors
    public HeightDemographics() {}

    public HeightDemographics(Long id, String gender, Integer heightInInches,
                              Double height20_29, Double height30_39, Double height40_49,
                              Double height50_59, Double height60_69, Double height70_79) {
        this.id = id;
        this.gender = gender;
        this.heightInInches = heightInInches;
        this.height20_29 = height20_29;
        this.height30_39 = height30_39;
        this.height40_49 = height40_49;
        this.height50_59 = height50_59;
        this.height60_69 = height60_69;
        this.height70_79 = height70_79;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Integer getHeightInInches() { return heightInInches; }
    public void setHeightInInches(Integer heightInInches) { this.heightInInches = heightInInches; }

    public Double getHeight20_29() { return height20_29; }
    public void setHeight20_29(Double height20_29) { this.height20_29 = height20_29; }

    public Double getHeight30_39() { return height30_39; }
    public void setHeight30_39(Double height30_39) { this.height30_39 = height30_39; }

    public Double getHeight40_49() { return height40_49; }
    public void setHeight40_49(Double height40_49) { this.height40_49 = height40_49; }

    public Double getHeight50_59() { return height50_59; }
    public void setHeight50_59(Double height50_59) { this.height50_59 = height50_59; }

    public Double getHeight60_69() { return height60_69; }
    public void setHeight60_69(Double height60_69) { this.height60_69 = height60_69; }

    public Double getHeight70_79() { return height70_79; }
    public void setHeight70_79(Double height70_79) { this.height70_79 = height70_79; }
}