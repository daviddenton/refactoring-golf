package a;

import java.util.Arrays;
import java.util.List;

public class TakeHomeCalculator {

    private final int percent;

    public TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    public Pair netAmount(Pair first, Pair... rest) {

        List<Pair> pairs = Arrays.asList(rest);

        Pair total = first;
        for (Pair next : pairs) {
            if (!next.string.equals(total.string)) {
                throw new Incalculable();
            }

            total = new Pair(total.number + next.number, next.string);
        }

        Double amount = total.number * (percent / 100d);
        Pair tax = new Pair(amount.intValue(), first.string);

        if (first.string.equals(tax.string)) {
            return new Pair(total.number - tax.number, first.string);
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
