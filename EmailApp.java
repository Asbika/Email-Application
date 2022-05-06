package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email email1=new Email("hicham","asbika");
		//email1.changePassword(null);
		//email1.setMailboxCpacity(0);
		//System.out.println("Your new emailis: "+email1.get);
		//email1.setAlternateEmail(null);
		//email1.setAlternateEmail("hicham.asbika@gmail.com");
		//System.out.println("Your new email: "+email1.getAlternateEmail());
		//email1.setMailboxCpacity(700);
		//System.out.println("Capacity mailBox: "+email1.getMailboxCapacity()+"mb");
		System.out.println(email1.showInfo());
	}

}
