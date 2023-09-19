package com.atilla.vetApp.VetApplication.repository;

import com.atilla.vetApp.VetApplication.modules.entities.Vaccinations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccinations,Long> {
}
