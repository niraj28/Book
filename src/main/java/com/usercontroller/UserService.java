package com.usercontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
    UserRepository repository;

	public void adduser(User user) {
		repository.save(user);
		
	}

	public List<User> findAll() {
	List<User> users=new ArrayList<>();
	
	 repository.findAll().forEach(users::add);
	return users;
	}

	public User findById(String userid) {
		// TODO Auto-generated method stub
		return repository.findById(userid).orElse(null);
	}

	public void updateUser(String userid, User user) {
		repository.save(user);
		
	}

	public void deleteById(String userid) {
		repository.deleteById(userid);
	}

	public User checkLogin(User user) {
		final String loginid=user.getUserid();
		final String password=user.getPassword();
		ArrayList<User> users=new ArrayList<>();
		repository.findAll().forEach(users::add);
		String result="Invalid User";
		for(User client:users) {
	    String temp_loginid= client.getUserid();
	    String temp_password=client.getPassword();

		if( temp_loginid.equals(loginid) && temp_password.equals(password))
		{System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		  result=temp_loginid;
	      return repository.findById(result).orElse(null);
		}
		}
		return null;
		
		
	} 

}
