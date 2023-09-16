package com.atilla.vetApp.VetApplication.modules.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "operations")
public class Operations {
    private long id;
    private String operationName;
}
