package ch06;

/**
 * @author DiveTech
 * @since 2019-06-06
 */

public class Franc extends Money {

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}

}
