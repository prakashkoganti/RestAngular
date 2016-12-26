package com.java.spring.dto;
import java.util.Date;

public class Emp{  
	
	private String userId;
	private String esiId;
	private String empName;  
	private String projectName;
	private String technology;
	private String dateOfbirth;
	private String mobile;
	private String accentureEmail;
	private String personalEmail;
	
	public Emp() {
	}
	public Emp(String userId, String esiId, String empName, String projectName, String technology, String dateOfbirth,
			String mobile, String accentureEmail, String personalEmail) {
		super();
		this.userId = userId;
		this.esiId = esiId;
		this.empName = empName;
		this.projectName = projectName;
		this.technology = technology;
		this.dateOfbirth = dateOfbirth;
		this.mobile = mobile;
		this.accentureEmail = accentureEmail;
		this.personalEmail = personalEmail;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEsiId() {
		return esiId;
	}
	public void setEsiId(String esiId) {
		this.esiId = esiId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAccentureEmail() {
		return accentureEmail;
	}
	public void setAccentureEmail(String accentureEmail) {
		this.accentureEmail = accentureEmail;
	}
	public String getPersonalEmail() {
		return personalEmail;
	}
	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}
	@Override
	public String toString() {
		return "Emp [userId=" + userId + ", esiId=" + esiId + ", empName=" + empName + ", projectName=" + projectName
				+ ", technology=" + technology + ", dateOfbirth=" + dateOfbirth + ", mobile=" + mobile
				+ ", accentureEmail=" + accentureEmail + ", personalEmail=" + personalEmail + "]";
	}


	} 