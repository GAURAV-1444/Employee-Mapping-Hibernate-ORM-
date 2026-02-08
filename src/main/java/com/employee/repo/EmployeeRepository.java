package com.employee.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.employee.entity.Employee;
import com.employee.util.HibernateUtil;

public class EmployeeRepository {

	public void save(Employee employee) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();

		s.save(employee);

		tx.commit();
		s.close();
	}

	public List<Employee> findAll() {
		Session s = HibernateUtil.getSessionFactory().openSession();
		List<Employee> list = s.createCriteria(Employee.class).list();
		s.close();
		return list;
	}
}
