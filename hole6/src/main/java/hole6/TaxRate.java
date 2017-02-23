package hole6;

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
        return Money.money(amount.intValue(), total.currency);
    }
}
