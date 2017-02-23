package hole6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        Integer first = new TakeHomeCalculator(TaxRate.taxRate(10)).netAmount(Money.money(40, "GBP"), Money.money(50, "GBP"), Money.money(60, "GBP")).value;
        assertEquals(135, first.intValue());
    }

    @Test(expected = Incalculable.class)
    public void cannotSumDifferentCurrencies() throws Exception {
        new TakeHomeCalculator(TaxRate.taxRate(10)).netAmount(Money.money(4, "GBP"), Money.money(5, "USD"));
    }
}