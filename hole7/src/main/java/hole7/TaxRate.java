package hole7;

public class TaxRate {
    private final int percent;

    private TaxRate(int percent) {
        this.percent = percent;
    }

    public static TaxRate taxRate(int percent) {
        return new TaxRate(percent);
    }

    Money apply(Money total) {
        Double amount = total.value * (percent / 100d);
        return Money.money(amount.intValue(), total.currency);
    }
}
