package after;

import static after.Money.money;
import static java.util.Arrays.stream;

public class Calculator {
    public static Money add(Money... monies) {
        return stream(monies).reduce(money(0, "GBP"), Money::plus);
    }
}
