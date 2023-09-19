package com.atilla.vetApp.VetApplication.service;

import com.atilla.vetApp.VetApplication.modules.dto.AnimalDTO;
import com.atilla.vetApp.VetApplication.modules.dto.OperationsDTO;
import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import com.atilla.vetApp.VetApplication.modules.entities.Operations;
import com.atilla.vetApp.VetApplication.modules.mapper.OperationSafeMapper;
import com.atilla.vetApp.VetApplication.repository.OperationRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationsService {
    private final OperationRepository operationRepository;
    private OperationSafeMapper operationSafeMapper;
    @Autowired
    public OperationsService(OperationRepository operationRepository){
        this.operationRepository = operationRepository;
    }
    public Operations addOperation(OperationsDTO operationsDTO){
        Operations operation = operationSafeMapper.operationDTO2Operation(operationsDTO);
        return operationRepository.save(operation);
    }
    public List<Operations> getAllOperations(){
        return operationRepository.findAll();
    }

    public Operations getById(Long id){
        return operationRepository.getReferenceById(id);
    }
    public void deleteById(Long id){
        operationRepository.deleteById(id);
    }

}
