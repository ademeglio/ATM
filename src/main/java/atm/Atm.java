package atm;

public class Atm {

	private double balance;
	private String requiredPin;

	// Constructor
	public Atm(double balance, String requiredPin) {
		this.balance = balance;
		this.requiredPin = requiredPin;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		if (balance > amount) {
			balance -= amount;
		} else {
			balance -= balance;
		}
	}

	public void deposit(double amount) {
		balance += amount;
		
	}

	public boolean allowAccess(String enteredPin) {
		
		if (requiredPin.equals(enteredPin)) {
			return true;
		} else {
			return false;		
		}	
	}

}
