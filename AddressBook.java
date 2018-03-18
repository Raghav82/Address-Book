/****
 * Raghav Singh
 * Professor Alsaffar
 * Computer Science 1
 * BookDriver.java 
 * This AddressBook class creates constructor and getter methods for BookDriver to create objects
 * which can hold all the information needed for an Address Book
 */
public class AddressBook {
	String lastName="" , firstName="" , email="" , phoneNumber="" , search=""; 
	public  AddressBook(String lastName ,String firstName , String email , String phoneNumber ) {
		// constructor for AddressBook object hold 4 variables
		this.lastName = lastName ;
		this.firstName = firstName ; 
		this.email = email ; 
		
		this.email = email ; 
		this.phoneNumber = phoneNumber ; 
		
	
		
	}
	public String getLastName(){
		//gets lastName from object
		return lastName ; 
	}
	public String getFirstName(){
		// gets firstName from object
		return firstName ; 
	}public String getEmail(){
		// gets email from object
		return email ; 
	}public String getPhoneNumber(){
		// gets phoneNumber from object
		return phoneNumber; 
	}
}
