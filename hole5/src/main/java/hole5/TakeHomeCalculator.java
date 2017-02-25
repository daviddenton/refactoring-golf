package hole5;

import java.util.Arrays;
import java.util.List;

import static hole5.Money.money;

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
        Money tax = money(amount.intValue(), first.currency);

        return total.minus(tax);
    }
}
