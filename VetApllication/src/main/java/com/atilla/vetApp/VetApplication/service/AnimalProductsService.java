package com.atilla.vetApp.VetApplication.service;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import com.atilla.vetApp.VetApplication.modules.mapper.AnimalProductsMapper;
import com.atilla.vetApp.VetApplication.repository.AnimalProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalProductsService {
    @Autowired
    private AnimalProductsRepository animalProductsRepository;

    public AnimalProducts addProduct(AnimalProductsDTO animalProductsDTO){
        AnimalProducts animalProducts = AnimalProductsMapper.toEntity(animalProductsDTO);
        return animalProductsRepository.saveAndFlush(animalProducts);
    }
    public List<AnimalProducts> getAllAnimalProducts(){
        return animalProductsRepository.getAll();

    }
    public AnimalProducts getById(Long id){

        return (AnimalProducts) animalProductsRepository.getReferenceById(id);
    }
    public void deleteProduct(AnimalProductsDTO animalProductsDTO){
        AnimalProducts animalProducts = AnimalProductsMapper.toEntity(animalProductsDTO);
        animalProductsRepository.delete(animalProducts);
    }
}
