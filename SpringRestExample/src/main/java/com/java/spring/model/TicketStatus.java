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
public class TicketStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1765157903658338655L;

	@Id
	@Column(name = "Status_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Status_desc")
	private String statusDesc;

	public TicketStatus() {
		super();
	}
	public TicketStatus(Long id, String statusDesc) {
		super();
		this.id = id;
		this.statusDesc = statusDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

}