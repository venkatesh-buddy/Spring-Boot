package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/rest/employee/get/{id}")
	public Employee getEmployeeByID(@PathVariable("id") int id) {
		return employeeService.retrieve(id);
	}
	
	//Testing returning xml - yet to do
	@GetMapping(path="/rest/employee/getAll", produces = {MediaType.APPLICATION_JSON_VALUE})
	//Returning is List is supported with JSON response only
	//If you want XML, then add a wrapper class as Root XML element, for example EmployeeList
	public List<Employee> getAllEmployees() {
		return employeeService.getAll();
	}

	@PostMapping("/rest/employee/create")
	public Employee createEmployee(@RequestBody Employee emp) {
		employeeService.store(emp);
		return emp;
	}
	
	@GetMapping("/rest/employee/search/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) {
		return employeeService.search(name);
	}
	
	@DeleteMapping("/rest/employee/delete/{id}")
	public Employee deleteEmployeeByID(@PathVariable("id") int id) {
		return employeeService.delete(id);
	}
}