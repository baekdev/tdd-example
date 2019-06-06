import junit.framework.TestCase;

/**
 * @author DiveTech
 * @since 2019-06-06
 */
public class TotalTest extends TestCase {

	public void test_multiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}

}
