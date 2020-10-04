package com.usercontroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;




 
@CrossOrigin(origins="*",maxAge=3600)
 
@RestController
public class UserController {
	
	
    @Autowired
    UserService userservice;
      
    @RequestMapping(method=RequestMethod.POST, value="/user/save")
    public void add(@RequestBody User user){
        userservice.adduser(user);
        
    }
      
      
    @RequestMapping("/user/findall")
    public List<User> findAll(){
    	return userservice.findAll();
       
    }
      
    @RequestMapping("/user/findby/{userid}")
    public User findById(@PathVariable String userid){
      return userservice.findById(userid);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value="/user/updateby/{userid}")
	public void updateUser(@RequestBody User user,@PathVariable String userid) {
	userservice.updateUser(userid, user);	
	}
      
    @RequestMapping("/user/deleteby/{userid}")
    public void deleteByBookId(@PathVariable String userid){
        
         userservice.deleteById(userid);   
      
    }
    @RequestMapping(method=RequestMethod.POST, value="/user/loginform")
    public User checkLogin(@RequestBody User user){
       return userservice.checkLogin(user);
        
    }
      
    
   
}
