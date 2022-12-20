package com.tabs.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tabs.spring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
