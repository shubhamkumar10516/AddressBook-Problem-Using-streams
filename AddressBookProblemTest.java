package com.bridgelab.addressBookProblem;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class AddressBookProblemTest {

	@Test
	public void AddingToCsvFileTest() throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
		AddressBook addressBook = new AddressBook();
		addressBook.addContact(new Contact("Shubham", "Gaya", "Bihar", 82300, 12334));
		addressBook.addContact(new Contact("Shu", "Pune", "Mah", 88923001, 873512));
		 assertTrue(2== addressBook.addToCsvFile());
	}
	
	@Test
	public void AddingToJsonFileTest() throws IOException {
		AddressBook addressBook = new AddressBook();
		addressBook.addedToJson(new Contact("Shubham", "Gaya", "Bihar", 82300, 12334));
		addressBook.addedToJson(new Contact("Shu", "Pune", "Mah", 88923001, 873512));
	}
}
