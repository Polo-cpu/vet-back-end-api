package com.atilla.vetApp.VetApplication.service;

import com.atilla.vetApp.VetApplication.modules.dto.VaccinationsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Operations;
import com.atilla.vetApp.VetApplication.modules.entities.Vaccinations;
import com.atilla.vetApp.VetApplication.modules.mapper.VaccinationSafeMapper;
import com.atilla.vetApp.VetApplication.repository.VaccinationRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class VaccinationsService {
    private final VaccinationRepository vaccinationRepository;
    private VaccinationSafeMapper vaccinationSafeMapper;
    @Autowired
    public VaccinationsService(VaccinationRepository vaccinationRepository){
        this.vaccinationRepository = vaccinationRepository;
    }
    public Vaccinations addVaccination(VaccinationsDTO vaccinationsDTO){
        Vaccinations vaccination = vaccinationSafeMapper.vaccinationDTO2Vaccination(vaccinationsDTO);
        return vaccinationRepository.save(vaccination);
    }
    public List<Vaccinations> getAll(){
        return vaccinationRepository.findAll();
    }
    public Vaccinations getById(Long id){
        return vaccinationRepository.getReferenceById(id);
    }
    public void deleteById(Long id){
        vaccinationRepository.deleteById(id);
    }

}
