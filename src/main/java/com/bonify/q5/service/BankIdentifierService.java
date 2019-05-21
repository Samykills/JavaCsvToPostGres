package com.bonify.q5.service;

import java.util.List;

import com.bonify.q5.model.BankIdentifierModel;

public interface BankIdentifierService {

	/**
	 * @return
	 */
	void readAllRecordsFromCsv();

	/**
	 * @param bankIdentifier
	 * @return
	 */
	String findBankNameViaIdentifier(String bankIdentifier);

	List<BankIdentifierModel> readDBData();
}
