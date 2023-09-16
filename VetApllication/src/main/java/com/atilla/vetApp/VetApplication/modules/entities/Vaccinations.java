package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vaccinations")
public class Vaccinations {
    private long id;
    private String vaccinationType;
    private String lastVaccinationDay;


}
