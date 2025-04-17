package com.raj.employeemanagement.repository;

import com.raj.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Custom method to find employees by department
    List<Employee> findByDepartment(String department);
}
/*
 This repository:
Automatically provides all basic CRUD operations.
Adds a custom finder: findByDepartment(String department).
*/