package b;

class Money {
    final int value;
    final String currency;

    private Money(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    static Money money(int value, String currency) {
        return new Money(value, currency);
    }

    Money plus(Money that) {
        if (currency.equals(that.currency)) {
            return money(this.value + that.value, currency);
        } else {
            throw new a.Incalculable();
        }
    }

    Money minus(Money that) {
        if (currency.equals(that.currency)) {
            return money(this.value - that.value, currency);
        } else {
            throw new a.Incalculable();
        }
    }
}
