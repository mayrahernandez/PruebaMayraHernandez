package com.example.prueba.controller;
import com.example.prueba.entity.Person;
import com.example.prueba.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController

// Class
public class PersonController {

    // Annotation
    @Autowired private PersonService personService;

    // Save operation
    @PostMapping("/person")
    public Person savePerson(@RequestBody Person person)
    {
        return personService.savePerson(person);
    }

    // Read operation
    @GetMapping("/person")
    public List<Person> fetchPersonList()
    {
        return personService.fetchPersonList();
    }

    // Update operation
    @PutMapping("/person/{id}")
    public Person updatePerson(@RequestBody Person person, @PathVariable("id") Integer id)
    {
        return personService.updatePerson(person, id);
    }

    // Delete operation
    @DeleteMapping("/person/{id}")
    public String deletePersonById(@PathVariable("id") Integer id)
    {
        personService.deletePersonById(id);
        return "Deleted Successfully";
    }
}
