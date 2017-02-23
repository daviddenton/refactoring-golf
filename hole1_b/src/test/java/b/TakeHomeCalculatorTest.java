package b;

import org.junit.Test;

import static b.Money.money;
import static b.TaxRate.taxRate;
import static org.junit.Assert.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        assertEquals(135, new TakeHomeCalculator(taxRate(10)).netAmount(money(40, "GBP"), money(50, "GBP"), money(60, "GBP")).value);
    }

    @Test(expected = Incalculable.class)
    public void cannotSumDifferentCurrencies() throws Exception {
        new TakeHomeCalculator(taxRate(10)).netAmount(money(4, "GBP"), money(5, "USD"));
    }
}
