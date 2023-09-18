package com.atilla.vetApp.VetApplication.service;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import com.atilla.vetApp.VetApplication.modules.mapper.AnimalSafeMapper;
import com.atilla.vetApp.VetApplication.repository.AnimalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private AnimalSafeMapper animalSafeMapper;

    public Animal addAnimal(AnimalDTO animalDTO){
        Animal animal = animalSafeMapper.animalDTO2Animal(animalDTO);
        return animalRepository.save(animal);
    }
    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    public Animal animalGetById(Long id){
        return animalRepository.getReferenceById(id);
    }
    public void deleteById(Long id){
        animalRepository.deleteById(id);
    }

}
