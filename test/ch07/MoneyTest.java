package ch07;

import junit.framework.TestCase;

/**
 * @author DiveTech
 * @since 2019-06-06
 */
public class MoneyTest extends TestCase {

	public void test_equality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(10).equals(Money.dollar(15)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(10).equals(Money.franc(15)));
		assertFalse(Money.franc(10).equals(Money.dollar(10)));
	}

}
