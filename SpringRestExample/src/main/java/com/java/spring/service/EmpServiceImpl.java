package com.java.spring.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.java.spring.dao.EmpDao;
import com.java.spring.dto.Emp;
import com.java.spring.model.EmployeeDetails;


@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	@Qualifier("empDao")
	private EmpDao empDao;
	

	public Emp addNewUser(Emp emp) {
//		EmpData empData=new EmpData();
		EmployeeDetails empData=new EmployeeDetails();
		empData.setDateOfbirth(new Date(emp.getDateOfbirth()));
		empData.setAccentureEmailId(emp.getAccentureEmail());
		empData.setPersonalEmailId(emp.getPersonalEmail());
		empData.setId(new Long(emp.getUserId()));
		empData.setTechnologyName(emp.getTechnology());
		empData.setMobileNumber(emp.getMobile());
		empData.setProjectName(emp.getProjectName());
//		empData.setDateOfbirth(emp.getDateOfbirth());
		empData.setEmpName(emp.getEmpName());
		
		empData= empDao.saveEmpData(empData);
		return emp;
	}

	public Emp getUser(Long id) {
		Emp emp=new Emp();
		EmployeeDetails empData=empDao.fetchEmpData(id);
		emp.setAccentureEmail(empData.getAccentureEmailId());
		emp.setTechnology(empData.getTechnologyName());
		emp.setProjectName(empData.getProjectName());
		emp.setEmpName(empData.getEmpName());
		emp.setPersonalEmail(empData.getPersonalEmailId());
		emp.setUserId(empData.getId().toString());
		emp.setDateOfbirth(EmpUtils.convertDateToString(empData.getDateOfbirth()));
		return emp;
	}

}
