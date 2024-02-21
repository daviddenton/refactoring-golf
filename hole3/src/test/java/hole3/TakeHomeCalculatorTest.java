package hole3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        Integer first = new TakeHomeCalculator(10).netAmount(new TakeHomeCalculator.Money(40, "GBP"), new TakeHomeCalculator.Money(50, "GBP"), new TakeHomeCalculator.Money(60, "GBP")).value;
        assertEquals(135, first.intValue());
    }

    @Test
    public void cannotSumDifferentCurrencies() throws Exception {
        assertThrows(Incalculable.class, () -> {
            new TakeHomeCalculator(10).netAmount(new TakeHomeCalculator.Money(4, "GBP"), new TakeHomeCalculator.Money(5, "USD"));
        });

    }
}