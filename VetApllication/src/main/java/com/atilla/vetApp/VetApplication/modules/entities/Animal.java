package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;

import javax.annotation.processing.Generated;
import javax.persistence.*;


@Data
@Entity
@Getter
@Table(name = "animal")
public class Animal {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Animal Type")
    private String animalType;
    @Column(name = "Animal Name")
    private String animalName;
    @Column(name = "Owner Name")
    private String ownerName;
    @Column(name = "Animal Age")
    private String animalAge;
    @Column(name = "Animal Diseases")
    private String animalDiseases;
    @Column(name = "Animal Vaccinations")
    private Vaccinations vaccinations;
    @Column(name = "Animal Operations")
    private Operations operation;
    @Column(name = "Last Inspection Day")
    private String lastInspectionDay;
    public Animal(long id, String animalType, String animalName, String animalAge, String animalDiseases, Vaccinations vaccinations, Operations operation, String lastInspectionDay,String ownerName) {
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
    public Animal() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalAge(String animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalDiseases(String animalDiseases) {
        this.animalDiseases = animalDiseases;
    }

    public void setVaccinations(Vaccinations vaccinations) {
        this.vaccinations = vaccinations;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setLastInspectionDay(String lastInspectionDay) {
        this.lastInspectionDay = lastInspectionDay;
    }
}
