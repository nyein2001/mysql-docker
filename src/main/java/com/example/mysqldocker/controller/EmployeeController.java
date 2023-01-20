package com.example.mysqldocker.controller;

import com.example.mysqldocker.dao.EmployeeDao;
import com.example.mysqldocker.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeDao employeeDao;

    @GetMapping("/creation")
    public String init() {
        List<Employee> list = List.of(
                new Employee("John", "Doe", "jhon@gmail.com"),
                new Employee("Thomas", "Hurry", "thomas@gmail.com")
        );
        list.forEach(employeeDao::save);
        return "success";
    }

    @GetMapping("/emplyees")
    public Iterable<Employee> listEmployees() {
        return employeeDao.findAll();
    }
}
