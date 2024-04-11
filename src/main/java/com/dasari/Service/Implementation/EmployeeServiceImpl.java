package com.dasari.Service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dasari.Model.Employee;
import com.dasari.Repository.EmployeeRepository;
import com.dasari.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

}
