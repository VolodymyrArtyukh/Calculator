import com.testautomation.WebCalculator.WebCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebCalculatorTest extends BaseTest {

    private static WebCalculator webCalculator;

    @BeforeEach
    private void setup() {
        webCalculator = new WebCalculator(driver);
    }

    @Test
    public void testCombineUI() {
        webCalculator.combine(2, 2);
        assertEquals(webCalculator.expectedResult(), "4", "Result is incorrect: " + webCalculator.expectedResult());
        System.out.println("WEB Combine test: PASSED");
    }

    @Test
    public void testDeductUI() {
        webCalculator.deduct(10, 2);
        assertEquals(webCalculator.expectedResult(), "8", "Result is incorrect: " + webCalculator.expectedResult());
        System.out.println("WEB Deduct test: PASSED");
    }

    @Test
    public void testMultiplyUI() {
        webCalculator.multiply(10, 2);
        assertEquals(webCalculator.expectedResult(), "20", "Result is incorrect: " + webCalculator.expectedResult());
        System.out.println("WEB Multiply test: PASSED");
    }

    @Test
    public void testDivideUI() {
        webCalculator.divide(10, 2);
        assertEquals(webCalculator.expectedResult(), "5", "Result is incorrect: " + webCalculator.expectedResult());
        System.out.println("WEB Divide test: PASSED");
    }
}
