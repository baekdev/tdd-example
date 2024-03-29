package ch07;

/**
 * @author DiveTech
 * @since 2019-06-06
 */
abstract class Money {

	protected int amount;

	public boolean equals(Object object) {
		Money money = (Money)object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	abstract Money times(int multiplier);

	static Money dollar(int amount) {
		return new Dollar(amount);
	}

	static Money franc(int amount) {
		return new Franc(amount);
	}

}
