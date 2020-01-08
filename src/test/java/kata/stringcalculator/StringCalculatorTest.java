package kata.stringcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void emptyStringReturnsZero() {
        assertEquals(0, new StringCalculator().add(""));
    }

}