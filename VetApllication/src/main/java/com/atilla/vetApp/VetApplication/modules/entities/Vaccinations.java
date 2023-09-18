package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vaccinations")
public class Vaccinations {
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="vaccination_type")
    private String vaccinationType;
    @Column(name="last_vaccination_day")
    private String lastVaccinationDay;


}
