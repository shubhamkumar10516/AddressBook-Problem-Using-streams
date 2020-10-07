package com.academy.AddressBookMain;

public class Contacts {
      private String name;
      private String city;
      private String state;
      private int zip;
      private long phoneNumber;
	public Contacts(String name, String city, String state, int zip, long phoneNumber) {
		
		this.name = name;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void editContacts(String name, String city, String state, int zip, long phoneNumber) {
		
		this.name = name;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
       
		AddressBook adb = new AddressBook();
	
		adb.editContact(name,new Contacts(name, city, state, zip , phoneNumber));
	}
	
    public String toString(Contacts contact) {
	
    	return (contact.name+" "+contact.city+" "+contact.state+" "+contact.phoneNumber+" "+contact.zip);

    }
}
