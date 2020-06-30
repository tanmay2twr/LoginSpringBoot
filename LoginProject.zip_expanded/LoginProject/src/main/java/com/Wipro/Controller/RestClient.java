package com.Wipro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Wipro.Pojo.Authorities;
import com.Wipro.Pojo.Users;
import com.Wipro.Service.UserService;

@Controller
public class RestClient {

	@Autowired
	UserService userService;

	@RequestMapping("/newUser")
	public String Register(@RequestParam(value = "fname") String fname, @RequestParam(value = "lname") String lname,
			@RequestParam(value = "password") String password, @RequestParam(value = "email") String email) {

		Users u = new Users(email, fname, lname, password, "candidate", 1);

		Authorities a = new Authorities(email, "ROLE_candidate");

		userService.newUser(u, a);

		return "success";

	}

	@RequestMapping("/admin/getAllUsers")
	public String GetAllUsers(Model model) {

		List<Users> u = userService.getAllUsers();

		model.addAttribute("users", u);
		return "allUsers";
	}

}
