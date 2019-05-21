package com.bonify.q5.service;

import java.util.List;

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
}
