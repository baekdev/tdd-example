import junit.framework.TestCase;

/**
 * @author DiveTech
 * @since 2019-06-06
 */
public class TotalTest extends TestCase {

	public void test_multiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}

	public void test_equality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}
