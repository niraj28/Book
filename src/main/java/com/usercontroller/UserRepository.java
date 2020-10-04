package com.usercontroller;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User , String> {

}
