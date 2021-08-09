package com.microservice.departmentservice.service;

import com.microservice.departmentservice.entity.Department;
import com.microservice.departmentservice.repository.Departmentrepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class Departmentservice {

    @Autowired
    private Departmentrepository departmentrepository;


    public Department saveDepartment(Department department) {
        log.info("Inside method of savedepartment ");
        return departmentrepository.save(department);
    }

    public Optional<Department> finddepartmentbyid(int departmentId) {
        log.info("Inside service method of departmentid");
        return departmentrepository.findById(departmentId);
    }
}
