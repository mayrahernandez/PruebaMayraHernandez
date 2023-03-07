package com.example.prueba.entity;
import lombok.Data;

import javax.persistence.*;

// Annotations
@Entity
@Data

// Class
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private Integer documento;
    @Column
    private String name1;
    @Column
    private String name2;
    @Column
    private String lastname1;
    @Column
    private String lastname2;
    @Column
    private Integer roleid;
}
