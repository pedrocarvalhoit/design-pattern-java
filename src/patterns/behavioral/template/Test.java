package patterns.behavioral.template;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Network network = null;
		
		System.out.println("What is you username?");
		String userName = scan.next();
		System.out.println("Password now please:");
		String password = scan.next();
		
		//Post here
		System.out.println("What is in your mind?");
		String message = scan.next();
		
		System.out.println("Where do you want to post this content?\r\n"
				+ " 1 -> Facebook\r\n"
				+ "2 -> Twitter");
		int choice = Integer.parseInt(scan.next());
		
		if(choice == 1) {
			network = new Facebook(userName,password);
		}else if(choice == 2){
			network = new Twitter(userName,password);
		}
		network.post(message);
		
				

		
	}

}
