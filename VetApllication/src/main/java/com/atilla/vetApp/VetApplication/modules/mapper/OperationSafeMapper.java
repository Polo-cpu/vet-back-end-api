package com.atilla.vetApp.VetApplication.modules.mapper;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.dto.OperationsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import com.atilla.vetApp.VetApplication.modules.entities.Operations;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface OperationSafeMapper {
    @Mappings({
            @Mapping(source = "operationNameDTO",target = "operationName"),
            @Mapping(source = "priceDTO",target = "price")})
    public Operations operationDTO2Operation(OperationsDTO operationsDTO);
}
