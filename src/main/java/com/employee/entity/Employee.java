package com.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String name;
	private double salary;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptId")
	private Department department;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private EmployeeProfile profile;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employeeProject", joinColumns = @JoinColumn(name = "empId"), inverseJoinColumns = @JoinColumn(name = "projectId"))
	private List<Project> projects;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary, Department deptId) {
		super();
		this.name = name;
		this.salary = salary;
		this.department = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDeptId() {
		return department;
	}

	public void setDeptId(Department deptId) {
		this.department = deptId;
	}

	public EmployeeProfile getProfile() {
		return profile;
	}

	public void setProfile(EmployeeProfile profile) {
		this.profile = profile;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", deptId=" + department
				+ ", profile=" + profile + ", projects=" + projects + "]";
	}

}
