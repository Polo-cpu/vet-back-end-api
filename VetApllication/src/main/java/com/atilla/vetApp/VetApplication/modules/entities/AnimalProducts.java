package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Data
@Entity


@Table(name = "animal product")
public class AnimalProducts {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Animal Type")
    private String animalType;
    @Column(name = "Product")
    private String product;

    public AnimalProducts() {

    }

    public AnimalProducts(long id, String animalName, String product) {
        this.id = id;
        this.animalType = animalName;
        this.product = product;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAnimalType(String animaltype) {
        this.animalType = animaltype;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
