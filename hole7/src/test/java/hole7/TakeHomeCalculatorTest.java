package hole7;

import org.junit.Test;

import static hole7.Money.money;
import static hole7.TaxRate.taxRate;
import static org.junit.Assert.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        Integer first = new TakeHomeCalculator(taxRate(10)).netAmount(money(40, "GBP"), money(50, "GBP"), money(60, "GBP")).value;
        assertEquals(135, first.intValue());
    }

    @Test(expected = Incalculable.class)
    public void cannotSumDifferentCurrencies() throws Exception {
        new TakeHomeCalculator(taxRate(10)).netAmount(money(4, "GBP"), money(5, "USD"));
    }
}