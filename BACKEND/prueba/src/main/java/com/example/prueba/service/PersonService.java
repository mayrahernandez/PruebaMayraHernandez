package com.example.prueba.service;
import com.example.prueba.entity.Person;
import java.util.List;

// Interface
public interface PersonService {

    // Save operation
    Person savePerson(Person person);

    // Read operation
    List<Person> fetchPersonList();

    // Update operation
    Person updatePerson(Person person,Integer id);

    // Delete operation
    void deletePersonById(Integer id);
}
