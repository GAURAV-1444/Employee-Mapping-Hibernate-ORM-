package com.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeProfile")
public class EmployeeProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;

	private String address;
	private String phone;
	private String dob;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empId", unique = true)
	private Employee employee;

	public EmployeeProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeProfile(String address, String phone, String dob) {
		super();
		this.address = address;
		this.phone = phone;
		this.dob = dob;
	}
	

	public EmployeeProfile(String address, String phone, String dob, Employee employee) {
		super();
		this.address = address;
		this.phone = phone;
		this.dob = dob;
		this.employee = employee;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeProfile [profileId=" + profileId + ", address=" + address + ", phone=" + phone + ", dob=" + dob
				+ ", employee=" + employee + "]";
	}

}
