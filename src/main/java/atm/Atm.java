package atm;

import java.math.BigDecimal;

public class Atm {

	private BigDecimal balance;
	private String requiredPin;

	// Constructor
	public Atm(double balance, String requiredPin) {
		this.balance = new BigDecimal(balance);
		this.requiredPin = requiredPin;
	}

	public double getBalance() {
		return balance.doubleValue();
	}
	
	public void withdraw(double amount) {
		if (new BigDecimal(amount).compareTo(balance) > 0) {
			balance = new BigDecimal(0);
		} else {
			balance = balance.subtract(new BigDecimal(amount));
		}
	}

	public void deposit(double amount) {
		balance = balance.add(new BigDecimal(amount));
		
	}

	public boolean allowAccess(String enteredPin) {
		
		if (requiredPin.equals(enteredPin)) {
			return true;
		} else {
			return false;		
		}	
	}

}
