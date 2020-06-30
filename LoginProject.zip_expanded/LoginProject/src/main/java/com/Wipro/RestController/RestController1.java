package com.Wipro.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Wipro.Pojo.Authorities;
import com.Wipro.Pojo.Users;
import com.Wipro.SpringData.AuthorityRepository;
import com.Wipro.SpringData.UserRepository;

@RestController
public class RestController1 {

	@Autowired
	private UserRepository Userrepository;

	@Autowired
	private AuthorityRepository Authorityrepository;

	// Get-Mapping
	@GetMapping("/GetAllUsers")
	public List<Users> getAll() {

		return (List<Users>) Userrepository.findAll();
	}


	// Post Mapping
	@PostMapping("/addNewUser")
	public Users addNewUser(@Validated @RequestBody Users u) {

		return Userrepository.save(u);

	}

	// Post-Mapping
	@PostMapping("/addNewAuthority")
	public Authorities addNewAuthority(@RequestBody Authorities auth) {

		return Authorityrepository.save(auth);

	}


}
