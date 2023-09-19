package com.atilla.vetApp.VetApplication.controller;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import com.atilla.vetApp.VetApplication.service.AnimalProductsService;
import com.atilla.vetApp.VetApplication.service.AnimalService;
import com.atilla.vetApp.VetApplication.service.OperationsService;
import com.atilla.vetApp.VetApplication.service.VaccinationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/animal")
public class AnimalController {


    private final AnimalService animalService;

    public AnimalController(AnimalService animalService){
        this.animalService = animalService;

    }
    @GetMapping("/all")
    public ResponseEntity<List<Animal>> getAllAnimals(){
        List<Animal> animals = animalService.getAllAnimals();
        return new ResponseEntity<List<Animal>>(animals, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable("id") Long id){
        Animal animalById = animalService.getById(id);
        return new ResponseEntity<Animal>(animalById,HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Animal> addAnimal(@RequestBody AnimalDTO animalDTO ){
        Animal addAnimal = animalService.addAnimal(animalDTO);
        return new ResponseEntity<Animal>(addAnimal,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAnimalById(@PathVariable("id") Long id){
        animalService.deleteById(id);
       return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


}
