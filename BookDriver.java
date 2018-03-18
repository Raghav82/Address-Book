/****
 * Raghav Singh
 * Professor Alsaffar
 * Computer Science 1
 * BookDriver.java 
 * This program allows user to search by last name for an entry in their address book .  
 * If entry exists program will inform user and print it , if entry doesn't exist program
 * will take input from user in order to create a new entry
 * 
 * 
 */


import java.util.Scanner;
import java.util.Arrays;

public class BookDriver {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		boolean stop = false;
		// boolean to allow user to try again
		AddressBook[] myBook = new AddressBook[50];
		// creating array for 50 objects since we don't know how many are needed
		String lastName = "", firstName = "", email = "", phoneNumber = "" ; 
		// String variables for each piece of information
		for (int i = 0; i < myBook.length; i++) {
			myBook[i] = new AddressBook(firstName, lastName, email, phoneNumber);
			// this for loop creates empty entries to prevent null pointer exception
		}
		while (!stop) {
			// while stop = false this loop executes - allows user to exit
			for (int i = 0; i < myBook.length; i++) {
				// for loop so new arrays are created as user makes new entries
				System.out.println("Please enter a last name to begin your search");
				lastName = stdIn.next();
				// input lastName for search
				for (int j = 0; j < myBook.length; j++) {
					//new for loop so that each array is searched through
					if (lastName.equalsIgnoreCase(myBook[j].getLastName())) {
						// checks each name variable for each object - if it finds match next 2 lines execute 
						System.out.print("that entry already exists \n");
						System.out.printf("%s , %s ,%s , %s ", myBook[j].getLastName(), myBook[j].getFirstName(),
								myBook[j].getEmail(), myBook[j].getPhoneNumber());
						// prints name from entry which matched
							break;
						// breaks out of method , asks user if they want to try again
					} else {

						System.out.print("Please First Name");
						firstName = stdIn.next();
						// input firstName	
						System.out.print("Please enter email");
						email = stdIn.next();
						//input email
						System.out.print("Please enter Phone Number");
						phoneNumber = stdIn.next();
						//input phoneNumber
						myBook[i] = new AddressBook(firstName, lastName, email, phoneNumber);
						// creates new object in index i from counter - puts variables into constructor
						System.out.print("You've created a new entry for your book \n");

						System.out.printf("%s , %s ,%s , %s ", myBook[i].getLastName(), myBook[i].getFirstName(),
								myBook[i].getEmail(), myBook[i].getPhoneNumber());
						//prints new entry
						break;
						//breaks from if/else loop
					}
				}
				System.out.println("Would you like to enter a new contact? (yes or no)");
				String tryAgain = stdIn.next();
				if (tryAgain.equalsIgnoreCase("no")) {
					// if user doesnt want to try again stop = false and while loop doesn't execute
					stop = true;
					break;
				}

			}
		}
	}

}//end Main
