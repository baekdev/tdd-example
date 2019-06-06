package ch07;

import junit.framework.TestCase;

/**
 * @author DiveTech
 * @since 2019-06-06
 */
public class FrancTest extends TestCase {

	public void test_multiplication() {
		Money five = Money.franc(5);
		assertEquals(Money.franc(10), five.times(2));
		assertEquals(Money.franc(15), five.times(3));
	}

}
