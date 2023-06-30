package com.infosys.studs.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="student_fee")
@Data
public class FeeEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@Column(name = "stdid")
	public Integer stdid ;
	@Column(name = "fee")
	public String fee ;
	@Column(name = "totalamount")
	public String totalamount ;
	@Column(name = "amountpaid")
	public String amountpaid ;
	@Column(name = "amountdue")
	public String amountdue ;
	@Column(name = "lastamountpaid")
	public String lastamountpaid ;
	
}
