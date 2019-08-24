package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employee;

    @RequestMapping("/all")
    public HashMap<String, Employee> getAllEmployees()
    {
        return employee.getAll();
    }
    @RequestMapping("/{id}")
    public Employee getEmployeeId(@PathVariable String id)
    {
        return employee.getEmpId(id);
    }
}
