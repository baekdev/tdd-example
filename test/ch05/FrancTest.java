package ch05;

import ch05.Dollar;
import junit.framework.TestCase;

/**
 * @author DiveTech
 * @since 2019-06-06
 */
public class FrancTest extends TestCase {

	public void test_multiplication() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}

	public void test_equality() {
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
	}

}
