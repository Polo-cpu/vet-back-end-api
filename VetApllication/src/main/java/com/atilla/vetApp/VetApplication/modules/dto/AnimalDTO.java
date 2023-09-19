package com.atilla.vetApp.VetApplication.modules.dto;

import com.atilla.vetApp.VetApplication.modules.entities.Operations;
import com.atilla.vetApp.VetApplication.modules.entities.Vaccinations;
import lombok.*;


@Getter
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {
    private Long id;
    private String animalTypeDTO;
    private String animalNameDTO;
    private String ownerNameDTO;
    private String animalAgeDTO;
    private String animalDiseasesDTO;
    private String vaccinationsDTO;
    private String operationDTO;
    private String lastInspectionDayDTO;
}
