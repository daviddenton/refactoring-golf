package hole7;

import static java.util.Arrays.stream;

class TakeHomeCalculator {

    private final TaxRate taxRate;

    TakeHomeCalculator(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    Money netAmount(Money first, Money... rest) {
        Money total = stream(rest).reduce(first, Money::plus);
        Money tax = taxRate.apply(total);
        return total.minus(tax);
    }
}
