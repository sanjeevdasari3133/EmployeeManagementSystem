package com.dasari.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dasari.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
