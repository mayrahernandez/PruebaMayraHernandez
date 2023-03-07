package com.example.prueba.controller;
import com.example.prueba.entity.Role;
import com.example.prueba.service.RoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController

// Class
public class RoleController {

    // Annotation
    @Autowired private RoleService roleService;

    // Read operation
    @GetMapping("/role")
    public List<Role> fetchRoleList()
    {
        return roleService.fetchRoleList();
    }

}
