package com.atilla.vetApp.VetApplication.modules.mapper;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AnimalSafeMapper {
    @Mappings({
            @Mapping(source = "animalType",target = "animalType"),
            @Mapping(source = "animalName",target = "animalName"),
            @Mapping(source = "ownerName",target = "ownerName"),
            @Mapping(source = "animalAge",target = "animalAge"),
            @Mapping(source = "animalDiseases",target = "animalDiseases"),
            @Mapping(source = "vaccinations",target = "vaccinations"),
            @Mapping(source = "operation",target = "operation"),
            @Mapping(source = "lastInspectionDay",target = "lastInspectionDay")})
    public Animal animalDTO2Animal(AnimalDTO animalDTO);
}
