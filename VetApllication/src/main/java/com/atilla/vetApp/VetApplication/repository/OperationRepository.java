package com.atilla.vetApp.VetApplication.repository;

import com.atilla.vetApp.VetApplication.modules.entities.Operations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operations,Long>{
}
