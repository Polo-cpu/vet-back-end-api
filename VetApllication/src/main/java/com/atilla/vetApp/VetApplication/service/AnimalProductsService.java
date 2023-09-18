package com.atilla.vetApp.VetApplication.service;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import com.atilla.vetApp.VetApplication.modules.mapper.AnimalProductsSafeMapper;
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
    @Autowired
    private AnimalProductsSafeMapper animalProductsSafeMapper;
    public AnimalProducts addProduct(AnimalProductsDTO animalProductsDTO){
        AnimalProducts aProduct = animalProductsSafeMapper.animalProductsDTO2AnimalProduct(animalProductsDTO);
        return animalProductsRepository.save(aProduct);
    }
    public List<AnimalProducts> getAllAnimalProducts(){
        return animalProductsRepository.findAll();
    }
    public AnimalProducts getById(Long id){
        return (AnimalProducts) animalProductsRepository.getReferenceById(id);
    }
    public void deleteProduct(Long id){
        animalProductsRepository.deleteById(id);
    }
}
