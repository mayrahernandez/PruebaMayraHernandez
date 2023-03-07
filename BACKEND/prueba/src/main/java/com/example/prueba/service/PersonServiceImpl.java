package com.example.prueba.service;
import com.example.prueba.entity.Person;
import com.example.prueba.repository.PersonRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service

// Class
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    // Save operation
    @Override
    public Person savePerson(Person person)
    {
        return personRepository.save(person);
    }

    // Read operation
    @Override public List<Person> fetchPersonList()
    {
        return (List<Person>)
                personRepository.findAll();
    }

    // Update operation
    @Override
    public Person updatePerson(Person person, Integer id)
    {
        Person depDB = personRepository.findById(id).get();

        depDB.setDocumento(person.getDocumento());

        if (Objects.nonNull(person.getName1())
                && !"".equalsIgnoreCase(
                person.getName1())) {
            depDB.setName1(
                    person.getName1());
        }

        if (Objects.nonNull(person.getName2())
                && !"".equalsIgnoreCase(
                person.getName2())) {
            depDB.setName2(
                    person.getName2());
        }

        if (Objects.nonNull(person.getLastname1())
                && !"".equalsIgnoreCase(
                person.getLastname1())) {
            depDB.setLastname1(
                    person.getLastname1());
        }

        if (Objects.nonNull(person.getLastname2())
                && !"".equalsIgnoreCase(
                person.getLastname2())) {
            depDB.setLastname2(
                    person.getLastname2());
        }

        depDB.setRoleid(person.getRoleid());

        return personRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deletePersonById(Integer id)
    {
        personRepository.deleteById(id);
    }
}

