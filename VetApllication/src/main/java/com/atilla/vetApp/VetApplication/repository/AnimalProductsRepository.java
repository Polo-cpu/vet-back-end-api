package com.atilla.vetApp.VetApplication.repository;

import com.atilla.vetApp.VetApplication.modules.entities.AnimalProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalProductsRepository extends JpaRepository<AnimalProducts,Long> {
    List<AnimalProducts> getAll();

    void delete(AnimalProducts animalProducts);
}
