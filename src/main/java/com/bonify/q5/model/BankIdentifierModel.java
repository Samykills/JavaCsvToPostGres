package com.bonify.q5.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BankIdentifierTable")
public class BankIdentifierModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "bankName")
	private String bankName;
	@Column(name = "bankIdentifier")
	private String bankIdentifier;

	public BankIdentifierModel() {
		this.bankName = "";
		this.bankIdentifier = "";
	}

	public BankIdentifierModel(String bankName, String bankIdentifier) {
		this.bankName = bankName;
		this.bankIdentifier = bankIdentifier;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIdentifier() {
		return bankIdentifier;
	}

	public void setBankIdentifier(String bankIdentifier) {
		this.bankIdentifier = bankIdentifier;
	}

}
