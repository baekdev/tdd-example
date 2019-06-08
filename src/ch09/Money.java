package ch09;

/**
 * @author DiveTech
 * @since 2019-06-08
 */
class Money {

	protected int amount;
	private String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public boolean equals(Object object) {
		Money money = (Money)object;
		return amount == money.amount && this.currency.equals(money.currency);
	}

	static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	String currency() {
		return this.currency;
	}

	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
}
