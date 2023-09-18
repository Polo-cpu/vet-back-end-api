package com.atilla.vetApp.VetApplication.modules.dto;

import com.atilla.vetApp.VetApplication.modules.entities.Operations;
import com.atilla.vetApp.VetApplication.modules.entities.Vaccinations;
import lombok.*;


@Getter
@Data
@ToString
public class AnimalDTO {
    private Long id;
    private String animalType;
    private String animalName;
    private String ownerName;
    private String animalAge;
    private String animalDiseases;
    private String vaccinations;
    private String operation;
    private String lastInspectionDay;

    public AnimalDTO(Long id, String animalType, String animalName, String ownerName, String animalAge, String animalDiseases, String vaccinations, String operation, String lastInspectionDay) {
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
    public AnimalDTO(){

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
