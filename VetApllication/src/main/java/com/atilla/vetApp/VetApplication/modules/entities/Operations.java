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
@Table(name = "operations")
public class Operations {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "operation_name")
    private String operationName;
}
