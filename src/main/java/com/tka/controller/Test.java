package com.tka.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.model.Employee;

@RestController
public class Test {
	
	@RequestMapping("/check-balance/{accNumber}/{name}")
	public  String test1(@PathVariable int accNumber, @PathVariable String name) {
		System.out.println(accNumber);
		System.out.println(name);
		return "Testing";

	}

	
	@RequestMapping("/deposit")
	public  String test2(@RequestParam int accNumber, @RequestParam int amount) {
		System.out.println(accNumber);
		System.out.println(amount);
		return "Welcome....";

	}
	
	
	@RequestMapping(value="/register",method = RequestMethod.POST)
	public Employee  registerEmployee(@RequestBody Employee employee) {
		
		System.out.println(employee);
		return employee;
	}
	
	
	
	
}
