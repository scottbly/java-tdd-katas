import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void emptyStringReturnsZero() {
        assertEquals(0, new Calculator().add(""));
    }

}