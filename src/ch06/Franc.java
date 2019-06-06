package ch06;

/**
 * @author DiveTech
 * @since 2019-06-06
 */

class Franc extends Money {

	Franc(int amount) {
		this.amount = amount;
	}

	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}

}
