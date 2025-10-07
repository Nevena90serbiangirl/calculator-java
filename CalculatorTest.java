
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculateBasicExpression() {
        Calculator calc = new Calculator();
        String expression = "2+3*4";
        double expected = 14;
        double result = calc.Calculate(expression);

        assertEquals("Calculate should respect operator precedence", expected, result, 0.0001);
    }

}
