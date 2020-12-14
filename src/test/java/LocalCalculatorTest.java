import com.testautomation.CalculatorLogic.LocalCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LocalCalculatorTest {

    private static LocalCalculator localCalculator;
    private double expectedResult;
    private double actualResult;

    @BeforeAll
    public static void setUp() {
        localCalculator = new LocalCalculator();
    }

    @Test
    public void testCombine() {
        expectedResult = 4;
        actualResult = localCalculator.combine(2, 2);
        assertEquals(expectedResult, actualResult, "Combine test failed: 2 + 2 = " + actualResult);
        System.out.println("Combine test: PASSED");
    }

    @Test
    public void testDeduct() {
        expectedResult = 0;
        actualResult = localCalculator.deduct(5, 5);
        assertEquals(expectedResult, actualResult, "Deduct test failed: 5 - 5 = " + actualResult);
        System.out.println("Deduct test: PASSED");
    }

    @Test
    public void testMultiply() {
        expectedResult = 20;
        actualResult = localCalculator.multiply(4, 5);
        assertEquals(expectedResult, actualResult, "Multiply test failed: 4 * 5 = " + actualResult);
        System.out.println("Multiply test: PASSED");
    }

    @Test
    public void testDivide() {
        expectedResult = 10;
        actualResult = localCalculator.divide(20,2);
        assertEquals(expectedResult, actualResult, "Divide test failed: 20 / 2 = " + actualResult);
        System.out.println("Divide test: PASSED");
    }

}
