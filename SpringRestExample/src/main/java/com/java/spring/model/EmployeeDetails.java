package com.java.spring.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Details")
public class EmployeeDetails implements Serializable {

	private static final long serialVersionUID = -3395067890881712084L;

	@Id
	@Column(name = "emp_user_id")
//	@GeneratedValue(strategy = GenerationType.)
	private Long id;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "personal_email_id")
	private String personalEmailId;

	@Column(name = "accenture_email_id")
	private String accentureEmailId;

	@Column(name = "project_name")
	private String projectName;

	@Column(name = "technology_name")
	private String technologyName;
	
	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "date_Of_birth")
	private Date dateOfbirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPersonalEmailId() {
		return personalEmailId;
	}

	public void setPersonalEmailId(String personalEmailId) {
		this.personalEmailId = personalEmailId;
	}

	public String getAccentureEmailId() {
		return accentureEmailId;
	}

	public void setAccentureEmailId(String accentureEmailId) {
		this.accentureEmailId = accentureEmailId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

}