package a;

import org.junit.Test;

import static a.Money.money;
import static org.junit.Assert.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        assertEquals(135, new TakeHomeCalculator(10).netAmount(money(40, "GBP"), money(50, "GBP"), money(60, "GBP")).value);
    }

    @Test(expected = Incalculable.class)
    public void cannotSumDifferentCurrencies() throws Exception {
        new TakeHomeCalculator(10).netAmount(money(4, "GBP"), money(5, "USD"));
    }
}

/**
 * steps:
 * extract TaxRate parameter object
 * create field taxRate
 * inline percent
 * extract method
 * introduce parameter
 * move apply method to TaxRate
 * replace constructor with factory
 */
