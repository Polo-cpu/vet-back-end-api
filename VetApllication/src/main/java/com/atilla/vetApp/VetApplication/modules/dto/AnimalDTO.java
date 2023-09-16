package com.atilla.vetApp.VetApplication.modules.dto;

import com.atilla.vetApp.VetApplication.modules.entities.Operations;
import com.atilla.vetApp.VetApplication.modules.entities.Vaccinations;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;


@Getter
@Data
@AllArgsConstructor
public class AnimalDTO {
    private long id;
    private String animalType;
    private String animalName;
    private String ownerName;
    private String animalAge;
    private String animalDiseases;
    private Vaccinations vaccinations;
    private Operations operation;
    private String lastInspectionDay;
    @Autowired
    public AnimalDTO(){

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
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

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

    public void setLastInspectionDay(String lastInspectionDay) {
        this.lastInspectionDay = lastInspectionDay;
    }
}
