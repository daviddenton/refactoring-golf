package a;

import java.util.Arrays;
import java.util.List;

public class TakeHomeCalculator {

    private final int percent;

    public TakeHomeCalculator(int percent) {
        this.percent = percent;
    }

    public Pair<Integer, String> netAmount(Pair<Integer, String> first, Pair<Integer, String>... rest) {

        List<Pair<Integer, String>> pairs = Arrays.asList(rest);

        Pair<Integer, String> total = first;
        for (Pair<Integer, String> next : pairs) {
            if (!next.second.equals(total.second)) {
                throw new Incalculable();
            }

            total = new Pair<>(total.first + next.first, next.second);
        }

        Double amount = total.first * (percent / 100d);
        Pair<Integer, String> tax = new Pair<>(amount.intValue(), first.second);

        if (first.second.equals(tax.second)) {
            return new Pair<>(total.first - tax.first, first.second);
        }
        throw new Incalculable();
    }

    static class Pair<A, B> {
        final A first;
        final B second;

        Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

    }
}
