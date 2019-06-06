package ch06;

/**
 * @author DiveTech
 * @since 2019-06-06
 */

class Dollar extends Money{

	Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(amount * multiplier);
	}

}
