Employee Mapping System using Hibernate ORM

📌 Project Overview

This project demonstrates Hibernate ORM entity relationship mappings using Core Java and Hibernate.
The main goal of this project is to understand how Java objects are mapped to relational database tables and how relationships work internally in Hibernate.

This project focuses on learning ORM concepts, not on building REST APIs or a production-level application.

🛠️ Technologies Used

Java (Core Java)

Hibernate ORM

MySQL (or any relational database)

Maven

Eclipse IDE

📂 Project Structure
src/main/java
 ├── com.employee.entity
 │     ├── Employee.java
 │     ├── Department.java
 │     ├── EmployeeProfile.java
 │     └── Project.java
 │
 ├── com.employee.repository
 │     └── EmployeeRepository.java
 │
 ├── com.employee.service
 │     └── EmployeeServices.java
 │
 ├── com.employee.controller
 │     └── EmployeeController.java
 │
 ├── com.employee.util
 │     └── HibernateUtil.java
 │
 └── com.employee
       └── MainApp.java

🔗 Hibernate Mappings Implemented

This project covers the following Hibernate relationship mappings:

✅ One-to-One

Employee ↔ EmployeeProfile

Demonstrates how one employee is associated with exactly one profile.

✅ One-to-Many / Many-to-One

Department ↔ Employee

One department can have multiple employees.

Each employee belongs to one department.

✅ Many-to-Many

Employee ↔ Project

One employee can work on multiple projects.

One project can have multiple employees.

🔄 Hibernate Concepts Covered

Entity annotations (@Entity, @Id, @GeneratedValue)

Relationship annotations (@OneToOne, @OneToMany, @ManyToOne, @ManyToMany)

Join columns and foreign keys

Cascading (CascadeType)

Hibernate Session and Transaction

Automatic table creation using Hibernate configuration

▶️ How to Run the Project

Clone the repository

Import the project into Eclipse as a Maven Project

Configure database details in hibernate.cfg.xml

Run the MainApp class

Hibernate will create tables and perform operations automatically

🎯 Learning Objective

This project was created to:

Understand Hibernate ORM internals

Learn how entity relationships translate into SQL tables

Practice mapping annotations and cascading

Build a strong foundation before moving to Spring Boot & REST APIs

🚀 Future Enhancements

Convert this project into a Spring Boot application

Expose CRUD operations using REST APIs

Add DTOs and layered architecture

Add exception handling and validations


📌 Note

This is a learning-focused project intended to demonstrate Hibernate mapping concepts and ORM behavior.