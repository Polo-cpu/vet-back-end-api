package com.atilla.vetApp.VetApplication.modules.dto;

import lombok.*;

@Getter
@Data
@AllArgsConstructor

public class AnimalProductsDTO {
    private long id;
    private String animalType;
    private String product;
    public AnimalProductsDTO(){

    }
    public void setId(long id) {
        this.id = id;
    }

    public void setAnimalName(String animalName) {
        this.animalType = animalName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}
