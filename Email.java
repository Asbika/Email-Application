package emailapp;
import java.util.Scanner;

//on Va utiliser l'encapsulation //for don't people acctulley have acces on it derectly 
//we gonna get acces to our aclasse from classe IPA
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String departement;
	private String email;
	private int mailboxCapacity=500;
	private int defaultpassword=8;
	private String alternateEmail;
	private String companySuffix = "company.com";

	
	//Constractor to recive the first name and last name 
	public Email(String firstName,String lastName ) {
		this.firstName=firstName;/*reference to the local variable how we have in the parametre;*/
		this.lastName=lastName;/*"this" keyword are reference to the global variable*/
		
		//System.out.println("EMAIL CREATED: "+this.firstName +" "+this.lastName);
	    //call a method asking for the department - return the department
		this.departement=setDepartment();
		//System.out.println("Department: "+this.departement);//all this sysout we don't need to see them
		//Combine Elements to generate Email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+departement+"."+companySuffix;
		//System.out.println("Your email is: "+email);
		//call a method that returns a random password
		this.password=randomPassword(defaultpassword);
		//System.out.println("Your password is: "+this.password);
	}
	//Ask the IT specialist what kind of the department have this person 
	private String setDepartment() {
		System.out.println("New worker: "+ lastName+" " +firstName+"\nEnter Department Codes: \n1 for sales\n2 for Developement\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in=new Scanner(System.in);
		int depCoice=in.nextInt();
	    String depp;
	    
		switch(depCoice) {
		
		case 1:depp="sales";
			break ;
		case 2:depp="Developement";
			break ;
		case 3:depp="Accounting";
			break ;
		default :depp="";
			break;		
			
		}	
		//System.out.println("Department: "+depp);
		return depp;
	}
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNPQRSTUVWYZ0123456789!@#$%^&";//43    
		char[] password = new char[length]; //the length of our table
		for(int i=0; i<length;i++) {
			int rand =(int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//set the mailbox capacity  
	public void setMailboxCpacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	//set the alternate email 
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	//change the password 
	public void changePassword(String password) {
		this.password = password;
	}
	//because we use Ecapsulation concept, we should to accees to the variables with methods that's calls seters and geters.
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return 
				"COMPANY EMAIL: "+ email +
				"\nPASSWORD: "+ password +
				"\nMAILBOX CAPACITY: "+ mailboxCapacity + "mb";
	}
}
