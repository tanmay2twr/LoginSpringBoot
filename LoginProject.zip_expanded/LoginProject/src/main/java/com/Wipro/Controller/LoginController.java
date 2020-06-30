package com.Wipro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	// Redirecting to Login-Page

	@RequestMapping("/")
	public String Login() {

		return "login";
	}

	// Candidate-Mapping
	@RequestMapping("/candidate")
	public String User() {

		return "user";
	}

	// Admin-Mapping
	@RequestMapping("/admin")
	public String Admin() {

		return "admin";
	}

	// New Registration
	@RequestMapping("/register")
	public String Register() {

		return "register";
	}
}
