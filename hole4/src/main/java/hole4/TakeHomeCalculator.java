package hole4;

import java.util.Arrays;
import java.util.List;

class TakeHomeCalculator {

    private final int percent;

    TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    Money netAmount(Money first, Money... rest) {

        List<Money> monies = Arrays.asList(rest);

        Money total = first;

        for (Money next : monies) {
            total = total.plus(next);
        }

        Double amount = total.value * (percent / 100d);
        Money tax = new Money(amount.intValue(), first.currency);

        if (!total.currency.equals(tax.currency)) {
            throw new Incalculable();
        }
        return new Money(total.value - tax.value, first.currency);
    }

    static class Money {
        final Integer value;
        final String currency;

        Money(Integer value, String currency) {
            this.value = value;
            this.currency = currency;
        }

        Money plus(Money other) {
            if (!other.currency.equals(currency)) {
                throw new Incalculable();
            }
            return new Money(value + other.value, other.currency);
        }
    }
}
