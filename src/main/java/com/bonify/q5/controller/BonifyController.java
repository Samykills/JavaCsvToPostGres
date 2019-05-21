package com.bonify.q5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/")
@RestController
public class BonifyController {

	@RequestMapping("healthCheck")
	public String getAll() {
		return "Service is Up";
	}

	@RequestMapping("readFromCsv")
	public String readAllRecordsFromCsv() {
		return "";
	}

	@RequestMapping("findBankNameViaIdentifier")
	public String findBankNameViaIdentifier() {
		return "";
	}
}
