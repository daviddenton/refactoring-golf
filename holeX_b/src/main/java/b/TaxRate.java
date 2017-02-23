package b;

import static b.Money.money;

class TaxRate {
    private final int percent;

    private TaxRate(int percent) {
        this.percent = percent;
    }

    static TaxRate taxRate(int percent) {
        return new TaxRate(percent);
    }

    Money apply(Money in) {
        Double amount = in.value * (percent / 100d);
        return money(amount.intValue(), in.currency);
    }
}
