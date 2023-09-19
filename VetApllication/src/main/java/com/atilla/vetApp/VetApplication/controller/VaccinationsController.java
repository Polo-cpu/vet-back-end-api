package com.atilla.vetApp.VetApplication.controller;

import com.atilla.vetApp.VetApplication.modules.dto.VaccinationsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Vaccinations;
import com.atilla.vetApp.VetApplication.service.VaccinationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vaccination")
public class VaccinationsController {
    private VaccinationsService vaccinationsService;
    public VaccinationsController(VaccinationsService vaccinationsService){
        this.vaccinationsService = vaccinationsService;
    }
    public ResponseEntity<List<Vaccinations>> allVaccinations(){
        List<Vaccinations> allVaccination = vaccinationsService.getAll();
        return new ResponseEntity<List<Vaccinations>>(allVaccination, HttpStatus.OK);
    }
    public ResponseEntity<Vaccinations> addVaccination(@RequestBody VaccinationsDTO vaccinationsDTO){
        Vaccinations vaccination = vaccinationsService.addVaccination(vaccinationsDTO);
        return new ResponseEntity<Vaccinations>(vaccination,HttpStatus.CREATED);
    }
    public ResponseEntity<Vaccinations> vaccinationGetById(@PathVariable("id") Long id){
        Vaccinations vaccination = vaccinationsService.getById(id);
        return new ResponseEntity<Vaccinations>(vaccination,HttpStatus.OK);
    }
    public ResponseEntity<Void> deleteVaccination(Long id){
        vaccinationsService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
