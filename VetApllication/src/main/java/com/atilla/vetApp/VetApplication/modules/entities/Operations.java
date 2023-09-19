package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "operations")
public class Operations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "operation_name")
    private String operationName;
    @Column(name="price")
    private double price;
}
