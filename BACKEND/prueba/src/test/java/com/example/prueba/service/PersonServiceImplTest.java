package com.example.prueba.service;

import com.example.prueba.entity.Person;
import com.example.prueba.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class PersonServiceImplTest {
    @Mock
    private PersonRepository personRepository;
    @InjectMocks
    private PersonServiceImpl personServiceImpl;

    private Person person;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        person= new Person();
        person.setId(5);
        person.setDocumento(1234567890);
        person.setName1("user");
        person.setName2("");
        person.setLastname1("Prueba");
        person.setLastname2("");
        person.setRoleid(1);

    }

    @Test
    void fetchPersonList() {
        when(personServiceImpl.fetchPersonList()).thenReturn(Arrays.asList(person));
        assertNotNull(personServiceImpl.fetchPersonList());
    }

    @Test
    void savePerson() {
        when(personServiceImpl.savePerson(any(Person.class))).thenReturn(person);
        assertNotNull(personServiceImpl.savePerson(new Person())) ;
    }
}