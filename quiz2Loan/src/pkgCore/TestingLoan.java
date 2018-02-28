package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingLoan {

	@Test
	public void test() {
		Loan newCar = new Loan(35000.0, 0.0, 60, 0.10);
		assertEquals(-743.65, newCar.carMonthPay(), 0.00);
		assertEquals(-9618.79, newCar.interestSpent(), 0.0);
	}

}
