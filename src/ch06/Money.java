package ch06;

/**
 * @author DiveTech
 * @since 2019-06-06
 */
class Money {
	protected int amount;

	public boolean equals(Object object) {
		Money money = (Money)object;
		return amount == money.amount;
	}
}
