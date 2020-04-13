package com.rm.awesome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rm.awesome.model.RegistrationModel;

@Controller
public class RegistrationController {

	public static final String REGISTRATION_MODEL_NAME = "registration";
	public static final String REGISTRATION_VIEW = "registration";
	
	@GetMapping("/registration")
	public String getRegistration(Model model) {
		model.addAttribute(REGISTRATION_MODEL_NAME, new RegistrationModel());
		return REGISTRATION_VIEW;
	}
	
	@PostMapping("/registration")
	public String postRegistration(@ModelAttribute(name = REGISTRATION_MODEL_NAME) RegistrationModel registrationModel) {
		System.out.println(registrationModel.getName());
		return REGISTRATION_VIEW;
	}
	
}
