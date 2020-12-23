package API;

import com.testautomation.apiCalculator.ApiCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiCalculatorTest {

    ApiCalculator apiCalculator = new ApiCalculator();

    @Test
    public void testCombineAPI() {
        double number1 = 2.0;
        double number2 = 5.0;
        double expectedResult = 7.0;

        double actualResult = apiCalculator.combine(number1, number2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDeductAPI() {
        double number1 = 10.0;
        double number2 = 5.0;
        double expectedResult = 5.0;

        double actualResult = apiCalculator.deduct(number1, number2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplyAPI() {
        double number1 = 7.0;
        double number2 = 8.0;
        double expectedResult = 56.0;

        double actualResult = apiCalculator.multiply(number1, number2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivideAPI() {
        double number1 = 30.0;
        double number2 = 3.0;
        double expectedResult = 10.0;

        double actualResult = apiCalculator.divide(number1, number2);
        assertEquals(expectedResult, actualResult);
    }

}