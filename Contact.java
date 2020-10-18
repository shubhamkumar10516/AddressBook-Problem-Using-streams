package com.bridgelab.addressBookProblem;

public class Contact{
      private String name;
      private String city;
      private String state;
      private int zip;
      private long phoneNumber;
	public Contact(String name, String city, String state, int zip, long phoneNumber) {
		
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
	
		adb.editContact(name,new Contact(name, city, state, zip , phoneNumber));
	}
	
    public String toString(Contact contact) {
	
    	return (contact.name+" "+contact.city+" "+contact.state+" "+contact.phoneNumber+" "+contact.zip);

    }
}
