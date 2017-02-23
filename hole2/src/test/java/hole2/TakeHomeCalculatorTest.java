package hole2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        Integer first = new TakeHomeCalculator(10).netAmount(new TakeHomeCalculator.Pair<>(40, "GBP"), new TakeHomeCalculator.Pair<>(50, "GBP"), new TakeHomeCalculator.Pair<>(60, "GBP")).first;
        assertEquals(135, first.intValue());
    }

    @Test(expected = Incalculable.class)
    public void cannotSumDifferentCurrencies() throws Exception {
        new TakeHomeCalculator(10).netAmount(new TakeHomeCalculator.Pair<>(4, "GBP"), new TakeHomeCalculator.Pair<>(5, "USD"));
    }
}

/**
 * steps:
 * <p>
 * rename number to value
 * rename string to currency
 * rename Pair to Money
 * merge loops  (MANUAL)
 * kill second loop (MANUAL)
 * replace != with !.equals
 * extract variable
 * extract plus method
 * move plus method to Pair
 * replace loop with reduce  (MANUAL
 * extract Money to big boy
 * replace constructor with factory
 * replace with method reference (plus)
 * extract minus method
 * move minus method to Money
 * extract TaxRate parameter object
 * create field taxRate
 * inline percent
 * extract method
 * extract parameter
 * move apply method to TaxRate
 * replace constructor with factory
 */
// push-down
// invert
// permute
// extract interface
// pull-up

