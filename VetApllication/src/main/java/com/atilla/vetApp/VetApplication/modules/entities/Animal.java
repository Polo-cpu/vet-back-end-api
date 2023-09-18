package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;

import javax.persistence.*;


@Getter
@Data
@Entity
@ToString
@Table(name = "animal")
public class Animal {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "animal_type")
    private String animalType;
    @Column(name = "animal_name")
    private String animalName;
    @Column(name = "owner_name")
    private String ownerName;
    @Column(name = "animal_age")
    private String animalAge;
    @Column(name = "animal_diseases")
    private String animalDiseases;
    @Column(name = "animal_vaccinations")
    private String vaccinations;
    @Column(name = "animal_operations")
    private String operation;
    @Column(name = "last_inspection_day")
    private String lastInspectionDay;

    public Animal(Long id, String animalType, String animalName, String ownerName, String animalAge, String animalDiseases, String vaccinations, String operation, String lastInspectionDay) {
        this.id = id;
        this.animalType = animalType;
        this.animalName = animalName;
        this.ownerName = ownerName;
        this.animalAge = animalAge;
        this.animalDiseases = animalDiseases;
        this.vaccinations = vaccinations;
        this.operation = operation;
        this.lastInspectionDay = lastInspectionDay;
    }
    public Animal(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAnimalAge(String animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalDiseases(String animalDiseases) {
        this.animalDiseases = animalDiseases;
    }

    public void setVaccinations(String vaccinations) {
        this.vaccinations = vaccinations;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setLastInspectionDay(String lastInspectionDay) {
        this.lastInspectionDay = lastInspectionDay;
    }
}



