package com.dasari.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dasari.Model.Employee;
import com.dasari.Service.EmployeeService;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/home")
	public ModelAndView displayHome() {		
		ModelAndView model= new ModelAndView();
		model.setViewName("Home");
		return model;
	}
	
	@PostMapping("/register")
	public Employee saveEmployeeDetails(@ModelAttribute Employee employee) {		
		employee.setPassword(passwordEncoder.encode(employee.getPassword()));
		return employeeService.saveEmployee(employee);
		
	}

}
