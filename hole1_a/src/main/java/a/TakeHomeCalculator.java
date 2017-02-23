package a;

import static java.util.Arrays.stream;

public class TakeHomeCalculator {

    private final int percent;

    public TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    public Pair netAmount(Pair first, Pair... rest) {
        Pair total = stream(rest).reduce(first, (money, that) -> {
            if (money.string.equals(that.string)) {
                return new Pair(money.number + that.number, money.string);
            } else {
                throw new Incalculable();
            }
        });

        Double amount = total.number * (percent / 100d);
        Pair tax = new Pair(amount.intValue(), total.string);

        if (total.string.equals(tax.string)) {
            return new Pair(total.number - tax.number, total.string);
        }
        throw new Incalculable();
    }

    public static class Pair {
        final int number;
        final String string;

        public Pair(int number, String string) {
            this.number = number;
            this.string = string;
        }

    }
}
