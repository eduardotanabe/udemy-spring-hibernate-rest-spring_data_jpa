package com.luv2code.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luv2code.springboot.cruddemo.entity.Employee;

//@RepositoryRestResource(path = "members")   // com esta anotação estarei mudando o caminho, assim, o Spring estará mudando de http://localhost:8989/employees para http://localhost:8989/members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!!
}
