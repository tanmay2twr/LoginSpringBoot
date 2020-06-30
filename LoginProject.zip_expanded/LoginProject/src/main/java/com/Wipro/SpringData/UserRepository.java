package com.Wipro.SpringData;

import org.springframework.data.repository.CrudRepository;


import com.Wipro.Pojo.Users;

public interface UserRepository extends CrudRepository<Users,String> {

	
	
}
