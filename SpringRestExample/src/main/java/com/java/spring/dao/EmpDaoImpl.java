package com.java.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.spring.model.EmployeeDetails;;

@Repository
public class EmpDaoImpl implements EmpDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public EmployeeDetails saveEmpData(EmployeeDetails empData) {
		Session session=this.sessionFactory.getCurrentSession();
		session.save(empData);
		return empData;
	}
	@Transactional
	public EmployeeDetails fetchEmpData(Long id) {
		Session session=this.sessionFactory.getCurrentSession();
		EmployeeDetails returnED=(EmployeeDetails) session.get(EmployeeDetails.class,id);
		return returnED;
	}
}
