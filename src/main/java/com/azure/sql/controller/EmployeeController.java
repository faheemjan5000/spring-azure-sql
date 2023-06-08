package com.azure.sql.controller;

import com.azure.sql.model.Employee;
import com.azure.sql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

     @PostMapping("/add")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
         return employeeRepository.findAll();
    }

}
