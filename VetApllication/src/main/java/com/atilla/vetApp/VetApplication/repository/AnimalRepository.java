package com.atilla.vetApp.VetApplication.repository;

import com.atilla.vetApp.VetApplication.modules.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AnimalRepository extends JpaRepository<Animal,Long> {
}
