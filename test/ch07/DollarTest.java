package ch07;

import junit.framework.TestCase;

/**
 * @author DiveTech
 * @since 2019-06-06
 */
public class DollarTest extends TestCase {

	public void test_multiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

}
