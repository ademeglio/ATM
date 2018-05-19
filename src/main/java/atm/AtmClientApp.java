package atm;

import java.util.Scanner;

public class AtmClientApp {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Atm myAtm = new Atm(500, "1111");
		
		// Request Pin for access
		System.out.println("Please enter your PIN:");
		String enteredPin = userInput.nextLine();
		
		if (myAtm.allowAccess(enteredPin)) {
			System.out.println("Welcome to D Bank");
		} else {
			System.out.println("Sorry, Incorrect Pin, Goodbye.");
			System.exit(0);
		}
		
		// Deposit, Withdrawal, Balance Inquiries, Exit
		
		//boolean active = true;
		
		while (true) {
			System.out.println("Choose an Option:"
					+ "\n\t\tPress 1 to deposit funds."
					+ "\n\t\tPress 2 to withdraw funds."
					+ "\n\t\tPress 3 to check balance."
					+ "\n\t\tPress 4 to exit.");
			
			String choice = userInput.nextLine();
			
			switch (choice) {
			
			case "1":	
				System.out.println("Enter a deposit amount");
				double amount = userInput.nextDouble();
				myAtm.deposit(amount);
				System.out.println("Updated balance is: $" + myAtm.getBalance());
				userInput.nextLine();
				break;
			case "2":
				System.out.println("Enter withdrawal amount");
				amount = userInput.nextDouble();
				myAtm.withdraw(amount);
				System.out.println("Updated balance is: $" + myAtm.getBalance());
				userInput.nextLine();
				break;
			case "3":
				System.out.println("Your current balance is $" + myAtm.getBalance());
				break;
			case "4":
				System.out.println("Thank you for banking with D Bank, good bye.");
				userInput.close();
				System.exit(0);
			}
			System.out.println("Would you like to perform another transaction...");
		}
	}

}
