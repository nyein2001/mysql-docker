package com.example.mysqldocker.dao;

import com.example.mysqldocker.ds.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
}
