package com.dasari.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@GetMapping("/home")
	public ModelAndView displayHome() {		
		ModelAndView model= new ModelAndView();
		model.setViewName("Home");
		return model;
	}

}
