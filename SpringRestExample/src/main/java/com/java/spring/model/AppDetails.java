package com.java.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ticket_Status")
public class AppDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5280275945564435186L;

	@Id
	@Column(name = "app_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "app_desc")
	private String appDesc;

	public AppDetails() {

	}

	public AppDetails(Long id, String appDesc) {
		super();
		this.id = id;
		this.appDesc = appDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppDesc() {
		return appDesc;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

}