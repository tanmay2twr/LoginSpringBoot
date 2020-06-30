package com.Wipro.SpringData;

import org.springframework.data.repository.CrudRepository;


import com.Wipro.Pojo.Authorities;

public interface AuthorityRepository extends CrudRepository<Authorities,String>
{

}
