package atm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldHaveDefaultBalanceOf100() {
		// arrange
		Atm underTest = new Atm(100.00, " ");
		// act
		double balance = underTest.getBalance();
		// assert
		assertEquals(100.00, balance,0);
	}

	@Test
	public void shouldHaveDefaultBalanceOf200() {
		// arrange
		Atm underTest = new Atm(200.00, "");
		// act
		double balance = underTest.getBalance();
		// assert
		assertEquals(200, balance, 0);
	}

	@Test
	public void shouldHaveBalanceOf100AfterWithdrawOf100() {
		Atm underTest = new Atm(200, "");
		underTest.withdraw(100);
		double balance = underTest.getBalance();
		assertEquals(100, balance, 0);
	}

	@Test
	public void shouldHaveBalanceOf0AfterWithdrawalOf300() {
		Atm underTest = new Atm(200, "");
		underTest.withdraw(300);
		double balance = underTest.getBalance();
		assertEquals(0, balance, 0);
	}

	@Test
	public void shouldHaveBalanceOf300AfterDepositOf200() {
		Atm underTest = new Atm(0, "");
		underTest.deposit(100);
		double balance = underTest.getBalance();
		assertEquals(100, balance, 0);
	}

	@Test
	public void shouldAllowPinAccess() {
		Atm underTest = new Atm(100, "1234");
		boolean access = underTest.allowAccess("1234");
		assertTrue(access);
	}

	@Test
	public void shouldNotAllowPinAccess() {
		Atm underTest = new Atm(100, "1234");
		boolean access = underTest.allowAccess("1235");
		assertFalse(access);
	}
}
