package com.employee.EmployeeManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.employee.EmployeeManagement.entity.Employee;

//@RepositoryRestResource(path = "sooraz")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
