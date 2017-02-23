package a;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        assertEquals(135, new TakeHomeCalculator(10).netAmount(new TakeHomeCalculator.Pair(40, "GBP"), new TakeHomeCalculator.Pair(50, "GBP"), new TakeHomeCalculator.Pair(60, "GBP")).number);
    }

    @Test(expected = Incalculable.class)
    public void cannotSumDifferentCurrencies() throws Exception {
        new TakeHomeCalculator(10).netAmount(new TakeHomeCalculator.Pair(4, "GBP"), new TakeHomeCalculator.Pair(5, "USD"));
    }
}

/**
 * steps:
 * replace loop with sum
 *
 *
 * rename number to value
 * rename string to currency
 * rename Pair to Money
 * extract Money to big boy
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
