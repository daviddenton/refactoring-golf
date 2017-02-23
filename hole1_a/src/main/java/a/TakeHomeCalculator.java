package a;

import static a.Money.money;
import static java.util.Arrays.stream;

public class TakeHomeCalculator {

    private final int percent;

    public TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    public Money netAmount(Money first, Money... rest) {
        Money total = stream(rest).reduce(first, Money::plus);
        Double amount = total.value * (percent / 100d);
        Money tax = money(amount.intValue(), total.currency);
        return total.minus(tax);
    }
}
