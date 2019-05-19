package com.bonify.q5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BonifyController {

	@RequestMapping("/api/healthCheck")
	public String getAll() {
		return "Service is Up";
	}
}
