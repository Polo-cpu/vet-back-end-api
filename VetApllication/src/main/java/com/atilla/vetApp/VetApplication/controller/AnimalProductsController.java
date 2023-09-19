package com.atilla.vetApp.VetApplication.controller;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import com.atilla.vetApp.VetApplication.service.AnimalProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class AnimalProductsController {

    private AnimalProductsService animalProductsService;

    public AnimalProductsController(AnimalProductsService animalProductsService){
        this.animalProductsService = animalProductsService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<AnimalProducts>> getAll(){
        List<AnimalProducts> allProducts = animalProductsService.getAllAnimalProducts();
        return new ResponseEntity<List<AnimalProducts>>(allProducts, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<AnimalProducts> getById(@PathVariable("id") Long id){
        AnimalProducts animalProduct = animalProductsService.getById(id);
        return new ResponseEntity<AnimalProducts>(animalProduct,HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<AnimalProducts> createAnimalProduct(@RequestBody AnimalProductsDTO animalProductsDTO){
        AnimalProducts addAnimalProducts = animalProductsService.addProduct(animalProductsDTO);
        return new ResponseEntity<AnimalProducts>(addAnimalProducts,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(Long id){
        animalProductsService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }



}
