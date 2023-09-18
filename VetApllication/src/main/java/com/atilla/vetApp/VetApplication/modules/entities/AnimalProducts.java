package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "animal_product")
public class AnimalProducts {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "animal_types")
    private String animalTypes;
    @Column(name = "product")
    private String product;


}
