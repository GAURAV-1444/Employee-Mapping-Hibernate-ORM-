package com.employee.services;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.repo.EmployeeRepository;

public class EmployeeServices {

	EmployeeRepository er = new EmployeeRepository();

	public String insertEmployee(Employee emp) {
		try {
			er.save(emp);
			return "Employee inserted successfully";
		} catch (Exception e) {
			return "Insertion failed : " + e.getMessage();
		}
	}

	public List<Employee> getAllEmployees() {
		return er.findAll();
	}
}
