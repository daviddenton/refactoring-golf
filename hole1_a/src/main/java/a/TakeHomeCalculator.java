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

        int total = 0;
        for (Pair pair : pairs) {
            total = total + pair.number;
        }

        for (Pair next : pairs) {
            if (first.string != next.string) {
                throw new Incalculable();
            }
        }

        Double amount = total * (percent / 100d);
        Pair tax = new Pair(amount.intValue(), first.string);

        if (first.string.equals(tax.string)) {
            return new Pair(first.number - tax.number, first.string);
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
