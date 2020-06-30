package com.Wipro.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Wipro.Pojo.Authorities;
import com.Wipro.Pojo.Users;

@Service
public class UserService {

	RestTemplate template = new RestTemplate();

	public void newUser(Users u, Authorities a) {

		final String uri = "http://localhost:8060/addNewUser";

		final String url = "http://localhost:8060/addNewAuthority";

		RestTemplate template = new RestTemplate();

		Users user = template.postForObject(uri, u, Users.class);

		Authorities auth = template.postForObject(url, a, Authorities.class);

	}

	public List<Users> getAllUsers() {

		final String uri = "http://localhost:8060/GetAllUsers";

		Users[] u = template.getForObject(uri, Users[].class);

		List<Users> userList = Arrays.asList(u);

		return userList;

	}

}
