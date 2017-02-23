package a;

import static java.util.Arrays.stream;

public class TakeHomeCalculator {

    private final int percent;

    public TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    public Money netAmount(Money first, Money... rest) {
        Money total = stream(rest).reduce(first, (money, that) -> {
            if (money.currency.equals(that.currency)) {
                return new Money(money.value + that.value, money.currency);
            } else {
                throw new Incalculable();
            }
        });

        Double amount = total.value * (percent / 100d);
        Money tax = new Money(amount.intValue(), total.currency);

        if (total.currency.equals(tax.currency)) {
            return new Money(total.value - tax.value, total.currency);
        }
        throw new Incalculable();
    }

    public static class Money {
        final int value;
        final String currency;

        public Money(int value, String currency) {
            this.value = value;
            this.currency = currency;
        }

    }
}
