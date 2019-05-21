package com.bonify.q5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonify.q5.model.BankIdentifierModel;
import com.bonify.q5.service.BankIdentifierService;

@RequestMapping("/api/")
@RestController
public class BonifyController {

	@Autowired
	private BankIdentifierService bankIdentifierService;

	@RequestMapping("healthCheck")
	public String healthCheck() {
		return "Service is Up";
	}

	@RequestMapping("readFromCsv")
	public void readAllRecordsFromCsv() {
		 bankIdentifierService.readAllRecordsFromCsv();
	}

	@RequestMapping("findBankNameViaIdentifier")
	public String findBankNameViaIdentifier(String bankIdentifier) {
		return bankIdentifierService.findBankNameViaIdentifier(bankIdentifier);
	}
	
	@RequestMapping("getAll")
	public List<BankIdentifierModel> readDBData() {
		return bankIdentifierService.readDBData();
	}
	
}
