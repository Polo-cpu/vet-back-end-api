package com.atilla.vetApp.VetApplication.service;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import com.atilla.vetApp.VetApplication.modules.mapper.AnimalSafeMapper;
import com.atilla.vetApp.VetApplication.repository.AnimalRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;
    private AnimalSafeMapper animalSafeMapper;
    @Autowired
    public AnimalService(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }
    public Animal addAnimal(AnimalDTO animalDTO){
        Animal animal = animalSafeMapper.animalDTO2Animal(animalDTO);
        return animalRepository.saveAndFlush(animal);
    }
    public List<Animal> getAllAnimals(){
        return animalRepository.findAll();
    }

    public Animal getById(Long id){
        return animalRepository.getReferenceById(id);
    }
    public void deleteById(Long id){
        animalRepository.deleteById(id);
    }

}
