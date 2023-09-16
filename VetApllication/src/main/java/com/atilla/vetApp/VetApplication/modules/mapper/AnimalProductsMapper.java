package com.atilla.vetApp.VetApplication.modules.mapper;


import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;

public class AnimalProductsMapper {
    public static AnimalProductsDTO dto(AnimalProducts animalProducts){
        AnimalProductsDTO animalProductsDTO = new AnimalProductsDTO();
        animalProducts.setAnimalType(animalProductsDTO.getAnimalType());
        animalProducts.setProduct(animalProductsDTO.getProduct());
        return animalProductsDTO;
    }
    public static AnimalProducts toEntity(AnimalProductsDTO animalProductsDTO){
        AnimalProducts animalProducts = new AnimalProducts();
        animalProducts.setProduct(animalProductsDTO.getProduct());
        animalProducts.setAnimalType(animalProductsDTO.getAnimalType());
        return animalProducts;
    }

}
