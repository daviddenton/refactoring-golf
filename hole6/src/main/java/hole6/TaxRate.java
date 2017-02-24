package hole6;

import static hole6.Money.money;

public class TaxRate {
    private final int percent;

    private TaxRate(int percent) {
        this.percent = percent;
    }

    public static TaxRate taxRate(int percent) {
        return new TaxRate(percent);
    }

    public int getPercent() {
        return percent;
    }

    Money apply(Money total) {
        Double amount = total.value * (getPercent() / 100d);
        return money(amount.intValue(), total.currency);
    }
}
