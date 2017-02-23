package hole6;

import java.util.Arrays;
import java.util.List;

class TakeHomeCalculator {

    private final TaxRate taxRate;

    TakeHomeCalculator(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    Money netAmount(Money first, Money... rest) {

        List<Money> monies = Arrays.asList(rest);

        Money total = first;

        for (Money next : monies) {
            total = total.plus(next);
        }

        Money tax = taxRate.apply(total);
        return total.minus(tax);
    }
}
