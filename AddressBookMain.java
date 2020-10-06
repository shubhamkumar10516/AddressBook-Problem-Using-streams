package com.academy.AddressBookMain;

import java.util.*;
public class AddressBookMain {

	private static Dictionary1 dict = new Dictionary1();
	private static Contacts contact = null;
	private static Scanner sc = new Scanner(System.in);
	private static AddressBook addBook = new AddressBook();
	
	public static Contacts addContacts(AddressBook addBook){
		
		
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter city");
		String city = sc.nextLine();
		System.out.println("Enter state");
		String state = sc.nextLine();
		System.out.println("Enter phone no.");
		long ph = sc.nextLong();
		System.out.println("Enter zip");
		int zip = sc.nextInt();
		Contacts contact = new Contacts(name, city, state, zip , ph);
		addBook.addContact(contact);
		dict.addToDictionary(name ,state, city);
        return contact;
	}
	
	public static Contacts editContact(String name) {
		
		String state;
		String city;
		
	    contact = addBook.returnContact(name);
	    if(contact == null) {
	    	System.out.println("No record found");
	    	return null;
	    }
	
	   System.out.println("Edit:: Enter 1. for name\n 2. for city \n 3. for state::  ");
	
	   int ch = sc.nextInt();
	   switch(ch) {
	
	   case 1:
		  sc.nextLine();
	      name = sc.nextLine();
	      contact = new Contacts(name, contact.getCity(), contact.getState(), contact.getZip(), contact.getPhoneNumber());
		  break;
       case 2:
		  sc.nextLine();
	      city = sc.nextLine();
	      contact = new Contacts(contact.getName(), city, contact.getState(), contact.getZip(), contact.getPhoneNumber());
		  break;
	   case 3:
		  sc.nextLine();
	      state = sc.nextLine();
	      contact = new Contacts(contact.getName(), contact.getCity(), state, contact.getZip(), contact.getPhoneNumber());
		  break;
	}
	   return contact;
	}
	
	public static void main(String[] args) {
		// Displaying Welcome message
		
		
		System.out.println(".....Welcome to Address book....");
		System.out.println(" ---press 1 to add contacts and 2 to exit-- ");
		 int op = sc.nextInt();
		 while(op != 2) {
		  contact = addContacts( addBook);
		  System.out.println(" ---press 1 to add contacts and 2 to exit-- ");
		  op = sc.nextInt();
		 }
		 
		 while(true) {// Multiple checks
		 
		 System.out.println("Enter 1: Edit \n 2: Delete");
		 int opt = sc.nextInt();
		 if(opt == 1) {
			    System.out.println("Enter name whose contacts to be edited: ");
			    sc.nextLine();
			    String name = sc.nextLine();
	            Contacts contact = editContact(name);
		        System.out.println("Editing is in process..");
		        addBook.editContact(name, contact);
		}
		else {
			    sc.nextLine();
			    System.out.println("Enter the name to delete contacts:");
			    addBook.deleteContact(sc.nextLine());
		}
		 System.out.println("Enter -1 to exit..and click any integer to continue editing..");
		 int choice = sc.nextInt();
		 if(choice == -1)
			 break;
	 }
		 
		 System.out.println("Enter city to search the person");
		 sc.nextLine();
		 addBook.searchByCity(sc.nextLine());
		 
		 System.out.println("Enter state to search the person");
		 
		 addBook.searchByState(sc.nextLine());
		 
		 System.out.println("...state and city wise person's name....");
		 dict.viewPersonByCityAndState();
		 System.out.println("count  by state..");
		 dict.countByState(sc.nextLine());
		 System.out.println("count  by city..");
		 dict.countByCity(sc.nextLine());
	    
		 System.out.println("...sorting alphabetically by person's name...."); 
	     addBook.sortAlphabeticallyByPersonName();
   }
}

