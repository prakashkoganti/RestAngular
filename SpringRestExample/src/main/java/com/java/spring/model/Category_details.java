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
public class Category_details implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4629273543556801721L;

	@Id
	@Column(name = "Category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Category_desc")
	private String categoryDesc;

	public Category_details() {
		
	}
	public Category_details(Long id, String categoryDesc) {
		super();
		this.id = id;
		this.categoryDesc = categoryDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

}