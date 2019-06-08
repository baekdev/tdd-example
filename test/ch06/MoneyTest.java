package ch06;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author DiveTech
 * @since 2019-06-08
 */
public class MoneyTest extends TestCase {

	@Test
	public void test_equals() {
		assertFalse(new Dollar(5).equals(new Franc(6)));
	}
}