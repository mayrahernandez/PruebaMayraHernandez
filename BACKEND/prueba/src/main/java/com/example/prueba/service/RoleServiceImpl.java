package com.example.prueba.service;
import com.example.prueba.entity.Role;
import com.example.prueba.repository.RoleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service

// Class
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    // Read operation
    @Override public List<Role> fetchRoleList()
    {

        return (List<Role>)roleRepository.findAll();
    }

}

