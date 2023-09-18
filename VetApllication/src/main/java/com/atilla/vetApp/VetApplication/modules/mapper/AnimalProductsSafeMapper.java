package com.atilla.vetApp.VetApplication.modules.mapper;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface AnimalProductsSafeMapper {
    @Mappings({
            @Mapping(source = "animalTypes",target = "animalTypes"),
            @Mapping(source = "product",target = "product")})
    public AnimalProducts animalProductsDTO2AnimalProduct(AnimalProductsDTO animalProductsDTO);
}
