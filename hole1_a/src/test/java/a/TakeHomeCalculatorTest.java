package a;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        assertEquals(135, new TakeHomeCalculator(10).netAmount(new TakeHomeCalculator.Money(40, "GBP"), new TakeHomeCalculator.Money(50, "GBP"), new TakeHomeCalculator.Money(60, "GBP")).value);
    }

    @Test(expected = Incalculable.class)
    public void cannotSumDifferentCurrencies() throws Exception {
        new TakeHomeCalculator(10).netAmount(new TakeHomeCalculator.Money(4, "GBP"), new TakeHomeCalculator.Money(5, "USD"));
    }
}

/**
 * steps:
 * extract Money object
 * replace constructor with factory
 * extract plus method
 * move plus method to Money
 * replace with method reference (plus)
 * extract minus method
 * move minus method to Money
 * extract TaxRate parameter object
 * create field taxRate
 * inline percent
 * extract method
 * introduce parameter
 * move apply method to TaxRate
 * replace constructor with factory
 */
