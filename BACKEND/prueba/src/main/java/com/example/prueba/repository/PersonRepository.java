package com.example.prueba.repository;
import com.example.prueba.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface PersonRepository extends JpaRepository<Person, Integer> {

}


