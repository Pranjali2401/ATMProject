package Operations;

import java.util.Scanner;

public class Transaction {
	Scanner userInput = new Scanner(System.in);
	Amount amount = new Amount();
	
	public void atmOperation(int choice)  {
		switch(choice) {
		case 1 :
			System.out.println("Current Balance : "+amount.getAmount());
			break;
		case 2 :
			System.out.println("Withdrwal Amount : ");
			int withdrwalAmount = userInput.nextInt();
			if(amount.getAmount()>= withdrwalAmount) {
				amount.setAmount(amount.getAmount() - withdrwalAmount);
				System.out.println("Remaing Balance : "+ amount.getAmount());
				amount.setLastTransition("Withdrwal : "+withdrwalAmount);
			}
			
			else
			System.out.println("Insufficint Balance");
			break;
		case 3 : 
			System.out.println("Enter Deposite Amount : ");
			int depositeAmount = userInput.nextInt();
			amount.setAmount(amount.getAmount()+depositeAmount);
			System.out.println("New Balance is : "+ amount.getAmount());
			amount.setLastTransition("Deposite : "+depositeAmount);
			break;
		case 4 :
			System.out.println("Last Transition : "+amount.getLastTransition());
			break;
		case 5 :
			System.out.println("Thanks for Visiting !!!");
			break;
			
	    default :
	    	System.out.println("Please select Choice between 1 to 5");
		}
	}
	

}
