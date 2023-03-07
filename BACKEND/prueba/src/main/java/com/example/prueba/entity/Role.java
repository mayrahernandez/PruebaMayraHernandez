package com.example.prueba.entity;
import lombok.Data;

import javax.persistence.*;

// Annotations
@Entity
@Data

// Class
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String name;

}
