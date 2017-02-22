package after;

public class Money {
    final int value;
    final String currency;

    private Money(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public static Money money(int value, String currency) {
        return new Money(value, currency);
    }

    public Money plus(Money that) {
        if (currency.equals(that.currency)) {
            return money(this.value + that.value, currency);
        }
        throw new Incalculable();
    }
}
