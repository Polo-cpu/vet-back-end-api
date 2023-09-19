package com.atilla.vetApp.VetApplication.modules.mapper;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AnimalSafeMapper {
    @Mappings({
            @Mapping(source = "animalTypeDTO",target = "animalType"),
            @Mapping(source = "animalNameDTO",target = "animalName"),
            @Mapping(source = "ownerNameDTO",target = "ownerName"),
            @Mapping(source = "animalAgeDTO",target = "animalAge"),
            @Mapping(source = "animalDiseasesDTO",target = "animalDiseases"),
            @Mapping(source = "vaccinationsDTO",target = "vaccinations"),
            @Mapping(source = "operationDTO",target = "operation"),
            @Mapping(source = "lastInspectionDayDTO",target = "lastInspectionDay")})
    public Animal animalDTO2Animal(AnimalDTO animalDTO);
}
