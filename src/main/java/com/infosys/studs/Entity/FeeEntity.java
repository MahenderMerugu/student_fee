package com.infosys.studs.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="fee_dts")
@Data
public class FeeEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@Column(name = "courcecode")
	public String courceCode ;
	@Column(name = "tutionfee")
	public int tutionfee ;
	@Column(name = "splfee")
	public int splfee ;
	@Column(name = "bus")
	public int bus ;
	@Column(name = "hostal")
	public int hostal ;
	@Column(name = "labfee")
	public int labfee ;
	@Column(name = "libraryfee")
	public int libraryfee ;
	@Column(name = "totalamount")
	public int totalamount ;
	@Column(name = "amountpaid")
	public int amountpaid ;
	@Column(name = "amountdue")
	public int amountdue ;
	@Column(name = "status")
	public String status ;
	@Column(name = "createddate")
	public String createddate ;
	@Column(name = "updated")
	public String updated ;
	
}
