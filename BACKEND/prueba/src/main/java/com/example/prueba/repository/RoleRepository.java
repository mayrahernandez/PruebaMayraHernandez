package com.example.prueba.repository;
import com.example.prueba.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface
public interface RoleRepository extends JpaRepository<Role, Integer> {

}


