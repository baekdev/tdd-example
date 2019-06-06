package ch05;

/**
 * @author DiveTech
 * @since 2019-06-06
 */

public class Franc {

	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}

	public boolean equals(Object object) {
		Franc franc = (Franc)object;
		return amount == franc.amount;
	}

}
