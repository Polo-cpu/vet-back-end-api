package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;
import org.mapstruct.Mapping;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vaccinations")
public class Vaccinations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="vaccination_type")
    private String vaccinationType;
    @Column(name="last_vaccination_day")
    private String lastVaccinationDay;
    @Column(name="price")
    private double price;
}
