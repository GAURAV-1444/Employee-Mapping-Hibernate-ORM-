package com.employee.controller;

import java.util.List;

import com.employee.entity.Employee;
import com.employee.services.EmployeeServices;

public class EmployeeController {

	EmployeeServices es = new EmployeeServices();

	public void insertEmployee(Employee emp) {
		System.out.println(es.insertEmployee(emp));
	}

	public void showAllEmployees() {

		List<Employee> list = es.getAllEmployees();

		if (list.isEmpty()) {
			System.out.println("No employees found");
			return;
		}

		list.forEach(e -> {
			System.out.println("ID : " + e.getEmpId());
			System.out.println("Name : " + e.getName());
			System.out.println("Salary : " + e.getSalary());
			System.out.println("Department : " + e.getDeptId().getDeptName());
			System.out.println("--------------------");
		});
	}
}
