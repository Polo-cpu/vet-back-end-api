package com.atilla.vetApp.VetApplication.controller;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalProductsDTO;
import com.atilla.vetApp.VetApplication.modules.dto.OperationsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import com.atilla.vetApp.VetApplication.modules.entities.Operations;
import com.atilla.vetApp.VetApplication.service.AnimalProductsService;
import com.atilla.vetApp.VetApplication.service.OperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/operation")
public class OperationsController {
    private OperationsService operationsService;

    public OperationsController(OperationsService operationsService){
        this.operationsService = operationsService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Operations>> getAll(){
        List<Operations> allProducts = operationsService.getAllOperations();
        return new ResponseEntity<List<Operations>>(allProducts, HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Operations> getById(@PathVariable("id") Long id){
        Operations operation = operationsService.getById(id);
        return new ResponseEntity<Operations>(operation,HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<Operations> createOperation(@RequestBody OperationsDTO operationsDTO){
        Operations addOperation = operationsService.addOperation(operationsDTO);
        return new ResponseEntity<Operations>(addOperation,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(Long id){
        operationsService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
