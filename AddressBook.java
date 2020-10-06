package com.academy.AddressBookMain;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
   
	private List<Contacts> cList = new ArrayList<>();
    
	public void addContact(Contacts contact) {
		System.out.println("ADDING--->");
		cList.add(contact);
		System.out.println("Contact added!!");
	}
	
	public Contacts returnContact(String name) {
		
		for(Contacts cnt : cList) {
			
            if(cnt.getName().equals(name))
            	return cnt;
		}
		return null;
	}
    public void deleteContact(String name) {
    	Contacts contact = null;
    	
    	for(Contacts cnt : cList)
            if(cnt.getName() == name)
            	contact = cnt;
    	if(cList.remove(contact)) 
    		System.out.println("Contact deleted!!");
    	else 
    		System.out.println("Contact not founded!!");
    }
	
	public void editContact(String name, Contacts contact) {
		int i = 0;
		Contacts contact1 = null;
		
		
		for( i = 0 ; i < cList.size(); i++)
		    if(cList.get(i).getName().equals(name)) {
		    	contact1 = cList.get(i);
		    	cList.add(i, contact);
		    	cList.remove(contact1);
		    	break;
		    }
		
		System.out.println(cList.get(i).toString(contact));
		System.out.println("Contact Edited:: ");
	}
	
	public void searchByCity(String city) {
		
		System.out.println("...searching person in city...");
		
		List<Contacts> pList = cList.stream().filter(name -> {
			if(name.getCity().contentEquals(city))return true;
			return false;
		}).collect(Collectors.toList());
		
		
		
		pList.stream().forEach(n -> {
			System.out.println(n.getName());
		});
	}
     public void searchByState(String state) {
 		System.out.println("...searching person in state...");
	    	
		List<Contacts> pList = cList.stream().filter(name -> {
			if(name.getState().equals(state))return true;
			return false;
		}).collect(Collectors.toList());
	
		pList.stream().forEach(n -> {
			System.out.println("Name of person : "+ n.getName());
		});
	}
     
     public void sortAlphabeticallyByPersonName() {
    	 //cList = cList.stream().sorted().;
    	 cList.sort(Comparator.comparing(a -> a.getName()));
    	 cList.forEach(n -> {System.out.println(n.getName());});
     }
	
}
