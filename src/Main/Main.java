package Main;

import java.util.Scanner;

import Operations.Options;
import Operations.Transaction;

public class Main {

	public static void main(String ...args) {
	Options options = new Options();
	Transaction tran = new Transaction();
	
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("Please Enter Id : ");
	String id = userInput.next();
	System.out.println("Please Enter password : ");
	String password = userInput.next();
	
	if(id.equals("pranjali") && password.equals("12345")) {
		int choice;
		do {

			System.out.println(options.atmOption);
			choice = userInput.nextInt();
			tran.atmOperation(choice);

		}while(choice != 5);
		
	}
	else
		System.out.println("Invalid User id and Password ");		
	}
}
