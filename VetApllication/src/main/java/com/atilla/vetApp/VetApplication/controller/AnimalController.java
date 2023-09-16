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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;
    private AnimalProductsService animalProductsService;
    private OperationsService operationsService;
    private VaccinationsService vaccinationsService;

    public AnimalController(AnimalService animalService,
                            AnimalProductsService animalProductsService,
                            OperationsService operationsService,
                            VaccinationsService vaccinationsService){
        this.animalProductsService = animalProductsService;
        this.animalService = animalService;
        this.operationsService = operationsService;
        this.vaccinationsService = vaccinationsService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Animal>> getAllAnimals(){
        List<Animal> animals = animalService.getAllAnimals();
        return new ResponseEntity<List<Animal>>(animals, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable("id") long id){
        Animal animalById = animalService.animalGetById(id);
        return new ResponseEntity<Animal>(animalById,HttpStatus.OK);
    }
    @GetMapping("/get-owner-name/{name}")
    public ResponseEntity<List<Animal>> getAnimalsByOwnerName(@PathVariable("name") String name){
        List<Animal> animals = animalService.getAnimalsByOwnerName(name);
        return new ResponseEntity<List<Animal>>(animals,HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Animal> addAnimal(@RequestBody AnimalDTO animalDTO ){
        Animal addAnimal = animalService.addAnimal(animalDTO);
        return new ResponseEntity<Animal>(addAnimal,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{name}")
    public ResponseEntity<Void> deleteAnimalById(@PathVariable("name") String name){
        animalService.deleteAnimalByName(name);
       return new  ResponseEntity<Void>(HttpStatus.OK);
    }


}
