package ch09;

import junit.framework.TestCase;

/**
 * @author DiveTech
 * @since 2019-06-08
 */
public class MoneyTest extends TestCase {

	public void test_equality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(10).equals(Money.dollar(15)));
		assertFalse(Money.franc(10).equals(Money.dollar(10)));
	}

	public void test_currency() {
		assertEquals("USD", Money.dollar(5).currency());
		assertEquals("CHF", Money.franc(5).currency());
	}

	public void test_dollar_multiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	public void test_franc_multiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}

}
