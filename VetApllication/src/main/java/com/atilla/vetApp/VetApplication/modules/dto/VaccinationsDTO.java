package com.atilla.vetApp.VetApplication.modules.dto;

import lombok.*;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationsDTO {

    private Long id;

    private String vaccinationTypeDTO;

    private String lastVaccinationDayDTO;
    private double priceDTO;
}
