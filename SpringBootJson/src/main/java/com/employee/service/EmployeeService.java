package com.employee.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public class EmployeeService {

	private Map<Integer, Employee> employeeData;

	public EmployeeService() {
		this.employeeData = new HashMap<>();
		// creating initial data
		Employee emp = new Employee(1, "Pankaj");
		this.employeeData.put(1, emp);
	}

	public void store(Employee emp) {
		employeeData.put(emp.getId(), emp);
	}

	public Employee retrieve(int id) {
		return employeeData.get(id);
	}

	public Employee search(String name) {
		Collection<Employee> emps = employeeData.values();
		for (Employee emp : emps) {
			if (emp.getName().equalsIgnoreCase(name))
				return emp;
		}
		return null;
	}

	public Employee delete(int id) {
		Employee e = employeeData.get(id);
		this.employeeData.remove(id);
		return e;
	}

	public List<Employee> getAll() {
		List<Employee> emps = new ArrayList<>();

		for (Employee e : this.employeeData.values())
			emps.add(e);

		return emps;
	}

}