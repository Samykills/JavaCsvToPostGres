package com.bonify.q5.service.impl;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.bonify.q5.dao.BankIdentifierDao;
import com.bonify.q5.model.BankIdentifierModel;
import com.bonify.q5.service.BankIdentifierService;

@Component
public class BankIdentifierServiceImpl implements BankIdentifierService {

	@Value("${filePath}")
	private String fileName;

	@Autowired
	BankIdentifierDao bankIdentifierDao;

	@Override
	public void readAllRecordsFromCsv() {
		// TODO Auto-generated method stub
		CSVParser parser;
		try {
			BankIdentifierModel bim = new BankIdentifierModel();
			Reader reader = Files.newBufferedReader(Paths.get(fileName));
			parser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader());
			for (CSVRecord record : parser) {
				bim.setBankName(record.get("Name"));
				bim.setBankIdentifier(record.get("bank_Identifier"));
				System.out.printf("%s\t%s\n", record.get("Name"), record.get("bank_Identifier"));
				bankIdentifierDao.save(bim);
			}
			parser.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("error in reading file", e);
		}

	}

	@Override
	public String findBankNameViaIdentifier(String bankIdentifier) {
		// TODO Auto-generated method stub
		return null;
	}

}
