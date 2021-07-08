package com.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	
	@RequestMapping("/calculate/{a}/{b}")
	public Integer addNumber(@PathVariable Integer a, @PathVariable Integer b, @PathParam(value = "operator") String operator) {
		Integer result=0;
		
		try {
		switch(operator) {
		
		case "+" :   
			result= a+b;
			break;
			
		case "-" :
			result=a-b;
			break;
			
		case "*" :
			result=a*b;
			break;
			
		case "/" :
			result=a/b;
			break;
			
		default:
			System.out.println("operator passed is not avaialable" + operator);
		
		}
		}catch(Exception e) {
			System.out.println("Exception ocurred"+ e);
	//		HttpStatus.BAD_REQUEST;
		}
	
		
		return result;
	}

}
