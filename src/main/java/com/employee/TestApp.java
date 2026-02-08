package com.employee;

import java.util.Arrays;

import com.employee.controller.EmployeeController;
import com.employee.entity.Department;
import com.employee.entity.Employee;
import com.employee.entity.EmployeeProfile;
import com.employee.entity.Project;

public class TestApp {

	public static void main(String[] args) {
		EmployeeController ec = new EmployeeController();

		Department it = new Department("IT");

		Employee e1 = new Employee("Gaurav", 50000, it);
		Employee e2 = new Employee("Rahul", 60000, it);

		EmployeeProfile profile1 = new EmployeeProfile("Pune", "9832300343", "14/4/2004", e1);
		EmployeeProfile profile2 = new EmployeeProfile("Pune", "7447300292", "19/3/2006", e2);

		e1.setProfile(profile1);
		e2.setProfile(profile2);

		Project p1 = new Project("Hibernate Project");

		e1.setProjects(Arrays.asList(p1));
		e2.setProjects(Arrays.asList(p1));
		p1.setEmployees(Arrays.asList(e1, e2));

		ec.insertEmployee(e1);
		ec.insertEmployee(e2);

		ec.showAllEmployees();
	}
}
