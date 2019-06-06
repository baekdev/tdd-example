package ch05;

/**
 * @author DiveTech
 * @since 2019-06-06
 */

class Franc {

	private int amount;

	Franc(int amount) {
		this.amount = amount;
	}

	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}

	public boolean equals(Object object) {
		Franc franc = (Franc)object;
		return amount == franc.amount;
	}

}
