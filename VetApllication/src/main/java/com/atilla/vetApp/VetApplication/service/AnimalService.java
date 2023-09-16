package com.atilla.vetApp.VetApplication.service;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import com.atilla.vetApp.VetApplication.modules.mapper.AnimalMapper;
import com.atilla.vetApp.VetApplication.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    public AnimalService(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    public Animal addAnimal(AnimalDTO animalDTO){
        Animal animal = AnimalMapper.toEntity(animalDTO);
        return animalRepository.saveAndFlush(animal);
    }
    public List<Animal> getAllAnimals(){
        return animalRepository.getAll();
    }
    public List<Animal> getAnimalsByOwnerName(String name){
        return animalRepository.getReferenceByName(name);
    }
    public Animal animalGetById(long id){
        return animalRepository.getReferenceById(id);
    }
    public void deleteAnimalByName(String animalName){
        Animal animal = new Animal();
        if(animal.getAnimalName().equals(animalName)){
            animalRepository.delete(animal);
        }
        else{
            System.out.println("Animal has not found");
        }
    }

}
