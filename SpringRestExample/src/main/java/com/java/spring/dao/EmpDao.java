package com.java.spring.dao;

import com.java.spring.model.EmployeeDetails;

public interface EmpDao {

	EmployeeDetails saveEmpData(EmployeeDetails empData);
	EmployeeDetails fetchEmpData(Long id);
}
