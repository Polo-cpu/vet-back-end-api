package com.atilla.vetApp.VetApplication.modules.mapper;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.dto.VaccinationsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import com.atilla.vetApp.VetApplication.modules.entities.Vaccinations;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface VaccinationSafeMapper {
    @Mappings({
            @Mapping(source = "vaccinationTypeDTO",target = "vaccinationType"),
            @Mapping(source = "lastVaccinationDayDTO",target = "lastVaccinationDay"),
            @Mapping(source = "priceDTO",target = "price")})
    public Vaccinations vaccinationDTO2Vaccination(VaccinationsDTO vaccinationsDTO);
}
