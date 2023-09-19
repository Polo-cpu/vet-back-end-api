package com.atilla.vetApp.VetApplication.modules.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AnimalProductsDTO {
    private Long id;
    private String animalTypesDTO;
    private String productDTO;
    private double priceDTO;
}
