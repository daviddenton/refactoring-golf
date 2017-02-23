package a;

import static java.util.Arrays.stream;

public class TakeHomeCalculator {

    private final TaxRate taxRate;

    public TakeHomeCalculator(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public Money netAmount(Money first, Money... rest) {
        Money total = stream(rest).reduce(first, Money::plus);
        Money tax = taxRate.apply(total);
        return total.minus(tax);
    }
}
