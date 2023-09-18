package com.atilla.vetApp.VetApplication.modules.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AnimalProductsDTO {
    private long id;
    private String animalTypes;
    private String product;
}
