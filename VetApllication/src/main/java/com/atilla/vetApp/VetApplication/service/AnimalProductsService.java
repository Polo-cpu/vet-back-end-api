package com.atilla.vetApp.VetApplication.service;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import com.atilla.vetApp.VetApplication.modules.mapper.AnimalProductsSafeMapper;
import com.atilla.vetApp.VetApplication.repository.AnimalProductsRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service

public class AnimalProductsService {
    private final AnimalProductsRepository animalProductsRepository;
    private AnimalProductsSafeMapper animalProductsSafeMapper;
    @Autowired
    public AnimalProductsService(AnimalProductsRepository animalProductsRepository){
        this.animalProductsRepository = animalProductsRepository;
    }

    public AnimalProducts addProduct(AnimalProductsDTO animalProductsDTO){
        AnimalProducts aProduct = animalProductsSafeMapper.animalProductsDTO2AnimalProduct(animalProductsDTO);
        return animalProductsRepository.save(aProduct);
    }
    public List<AnimalProducts> getAllAnimalProducts(){
        List<AnimalProducts> allProducts = animalProductsRepository.findAll();
        return allProducts;
    }
    public AnimalProducts getById(Long id){
        return (AnimalProducts) animalProductsRepository.getReferenceById(id);
    }
    public void deleteProduct(Long id){
        animalProductsRepository.deleteById(id);
    }
}
