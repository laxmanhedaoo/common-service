package com.common.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Enquiry implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	User customer;

	@ManyToMany
	private List<Question> questions;

	@Temporal(TemporalType.TIMESTAMP)
	private Date enquiryDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date followUpDate;

	@OneToOne
	private User attendedBy;

}
