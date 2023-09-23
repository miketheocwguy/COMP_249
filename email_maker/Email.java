package email_maker;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCap = 500;
	private int defultPasswordLength=10;
	private String email;
	private String alternateEmail;
	private String companySuffix = "Techcompany.com";
	
	//constructor for first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.print("EMAIL CREATED: "+ this.firstName +" "+ this.lastName);
		
		// call a method asking for the department - return department
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
		
		// method that returns a random password
		this.password = randomPassword(defultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.print("Your email is: "+ email);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.print("\n1 for Sales\n2 for Development\n3 for Accounting\n0 show none\n Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt();
		if(depChoice ==1) { return "sales";}
		else if (depChoice == 2) { return "dev";}
		else if (depChoice == 3) { return "acct";}
		else { return ""; }
	} 
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length;i++) {
			int rand = (int)(Math.random()* passwordset.length());
			password[i] = passwordset.charAt(rand);
			
		}
		return new String(password);
	}
	//set mail capacity
	public void setMailboxcap(int capacity) {
		this.mailboxCap =capacity;
	}
	
	//set alternate email address
	public void setAltEmail(String altemail) {
		this.alternateEmail = altemail;
	
	}
	
	//change password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getmailboxcap() { return mailboxCap; }
	public String getAltemail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		System.out.println("");
		return "DISPLAY NAME: " + firstName + " "+lastName+" COMPANY EMAIL: "+email+" MAILBOX CAPACITY: "+mailboxCap;
	}
	
	
}
