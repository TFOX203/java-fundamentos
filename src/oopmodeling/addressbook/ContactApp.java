package oopmodeling.addressbook;

import java.util.Scanner;

/*
 * 
 */

public class ContactApp {
	
	final static AddressBook addressBook = new AddressBook();
	final static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		byte option = 4;
		
		while(true) {
			showMenu();
			
			option = scanner.nextByte();
			System.out.println(option);
			
			if(option == 4) {
				System.out.println("Exit from the App");
				break;
			}
			
			else if (option == 1) {
				addContact();
				
			}
			
			
			
		}
		
		
		
	}

	private static void addContact() {
		System.out.println("/=== ADD CONTACT TO YOUR ADDRES BOOK ===/");
		// 1 The user introduce the number,name and other infomation about teh contact
		System.out.println("=== PLEASE ENTER THE NAME ===");
		String name = scanner.nextLine();
		System.out.println(name);
		// 2 Create an object of "Contact" encapsulating all the data passed in the firt step
		
		// 3 Add the new object to the contact list array
		
	}

	private static void showMenu() {
		System.out.println("/====== MENU ======/");
		System.out.println("1 /ADD CONTACT/");
		System.out.println("2 /SHOW CONTACT");
		System.out.println("3 /REMOVE CONTACT/");
		System.out.println("4 /EXIT/");
		
	}

}
