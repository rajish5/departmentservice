package com.microservice.departmentservice.controller;

import com.microservice.departmentservice.entity.Department;
import com.microservice.departmentservice.service.Departmentservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class Departmentcontroller {

    @Autowired
    private Departmentservice departmentservice;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("Inside Method of save department "+ department.toString());
        return departmentservice.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> finddepartmentbyid (@PathVariable("id") int departmentId)
    {
        log.info("Inside finddepartmentbyid");
        return departmentservice.finddepartmentbyid(departmentId);

    }

}
