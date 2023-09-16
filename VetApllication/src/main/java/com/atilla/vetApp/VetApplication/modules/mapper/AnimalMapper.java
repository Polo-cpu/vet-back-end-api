package com.atilla.vetApp.VetApplication.modules.mapper;


import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;

public class AnimalMapper {
    public static AnimalDTO dto(Animal animal){
        AnimalDTO animalDto = new AnimalDTO();
        animalDto.setAnimalName(animal.getAnimalName());
        animalDto.setOwnerName(animal.getOwnerName());
        animalDto.setAnimalAge(animal.getAnimalAge());
        animalDto.setAnimalType(animal.getAnimalType());
        animalDto.setAnimalDiseases(animal.getAnimalDiseases());
        animalDto.setOperation(animal.getOperation());
        animalDto.setLastInspectionDay(animal.getLastInspectionDay());
        animalDto.setVaccinations(animal.getVaccinations());
        return animalDto;
    }
    public static Animal toEntity(AnimalDTO animalDTO){
        Animal animal = new Animal();
        animal.setAnimalName(animalDTO.getAnimalName());
        animal.setOwnerName(animalDTO.getOwnerName());
        animal.setAnimalAge(animalDTO.getAnimalAge());
        animal.setAnimalType(animalDTO.getAnimalType());
        animal.setAnimalDiseases(animalDTO.getAnimalDiseases());
        animal.setOperation(animalDTO.getOperation());
        animal.setLastInspectionDay(animalDTO.getLastInspectionDay());
        animal.setVaccinations(animalDTO.getVaccinations());
        return animal;
    }

}
