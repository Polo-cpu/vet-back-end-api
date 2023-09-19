package com.atilla.vetApp.VetApplication.modules.dto;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OperationsDTO {
    private Long id;
    private String operationNameDTO;
    private double priceDTO;
}
