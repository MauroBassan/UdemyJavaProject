package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "begear.com";

	// Constructor 4 firstName e lastName

	public Email (String firstName, String lastName) {

		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email created successfully: "+this.firstName + " " + this.lastName);	

		// call a method asking dept - return dept.
		this.department = setDepartment();
		// System.out.println("Department" + this.department);

		// call a method that return a psw.
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your psw is: " + this.password);

		// combine elems to generate email
		email =  firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;


	}

	// ask 4 dept
	private String setDepartment() {
		System.out.println("New Worker: " + firstName + "\nEnter the dept: \n 1 for Sales \n 2 for Dev \n 3 for accounting \n 0 for none");
		Scanner in = new Scanner(System.in);
		int departmentChoice= in.nextInt();

		if (departmentChoice == 1) { return "Sales.";} 
		else if (departmentChoice == 2) { return "Dev.";}
		else if (departmentChoice == 3) { return "Acct.";}
		else {return"";}
	}

	// generate random psw
	private String randomPassword (int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char [length];
		for(int i = 0; i < length; i ++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}

	// set mailbox capacity

	public void setMailboxCapacity (int capacity) {
		this.mailboxCapacity = capacity;
	}
	// set alternate email
	public void setAlternateEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}

	// change psw
	public void changePassword (String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() { return mailboxCapacity; }
	
	public String getAlternateEmail() { return alternateEmail; }
	
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "Display name: " + firstName +" " + lastName + " "+ 
				"\nCompany email: " + email + " " +
				"\nMailbox Capacity: " +mailboxCapacity + "mb";
	}
}
