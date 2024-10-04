import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddPositiveIntegers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddNegativeIntegers() {
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    public void testAddWithZeroInteger() {
        assertEquals(3, calculator.add(3, 0));
    }

    @Test
    public void testAddNullIntegers() {
        assertThrows(NullPointerException.class, () -> calculator.add(null, 1));
    }

    @Test
    public void testAddPositiveDoubles() {
        assertEquals(5.5, calculator.add(2.5, 3.0), 0.001);
    }

    @Test
    public void testAddNegativeDoubles() {
        assertEquals(-1.0, calculator.add(-2.5, 1.5), 0.001);
    }

    @Test
    public void testAddWithZeroDouble() {
        assertEquals(3.0, calculator.add(3.0, 0.0), 0.001);
    }

    @Test
    public void testAddNullDoubles() {
        assertThrows(NullPointerException.class, () -> calculator.add(null, 1.0));
    }

    @Test
    public void testSubtractPositiveIntegers() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testSubtractNegativeIntegers() {
        assertEquals(-3, calculator.subtract(-2, 1));
    }

    @Test
    public void testSubtractWithZeroInteger() {
        assertEquals(3, calculator.subtract(3, 0));
    }

    @Test
    public void testSubtractNullIntegers() {
        assertThrows(NullPointerException.class, () -> calculator.subtract(null, 1));
    }

    @Test
    public void testSubtractPositiveDoubles() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0), 0.001);
    }

    @Test
    public void testSubtractNegativeDoubles() {
        assertEquals(-3.0, calculator.subtract(-2.0, 1.0), 0.001);
    }

    @Test
    public void testSubtractWithZeroDouble() {
        assertEquals(3.0, calculator.subtract(3.0, 0.0), 0.001);
    }

    @Test
    public void testSubtractNullDoubles() {
        assertThrows(NullPointerException.class, () -> calculator.subtract(null, 1.0));
    }

    @Test
    public void testMultiplyPositiveIntegers() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testMultiplyNegativeIntegers() {
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    public void testMultiplyWithZeroInteger() {
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    public void testMultiplyNullIntegers() {
        assertThrows(NullPointerException.class, () -> calculator.multiply(null, 2));
    }

    @Test
    public void testMultiplyPositiveDoubles() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.001);
    }

    @Test
    public void testMultiplyNegativeDoubles() {
        assertEquals(-6.0, calculator.multiply(-2.0, 3.0), 0.001);
    }

    @Test
    public void testMultiplyWithZeroDouble() {
        assertEquals(0.0, calculator.multiply(2.0, 0.0), 0.001);
    }

    @Test
    public void testMultiplyNullDoubles() {
        assertThrows(NullPointerException.class, () -> calculator.multiply(null, 2.0));
    }

    @Test
    public void testDividePositiveIntegers() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivideNegativeIntegers() {
        assertEquals(-2, calculator.divide(-6, 3));
    }

    @Test
    public void testDivideWithZeroInteger() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
    }

    @Test
    public void testDivideNullIntegers() {
        assertThrows(NullPointerException.class, () -> calculator.divide(null, 1));
    }

    // Double Divide Tests
    @Test
    public void testDividePositiveDoubles() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001);
    }

    @Test
    public void testDivideNegativeDoubles() {
        assertEquals(-2.0, calculator.divide(-6.0, 3.0), 0.001);
    }

    @Test
    public void testDivideWithZeroDouble() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(6.0, 0.0));
    }

    @Test
    public void testDivideNullDoubles() {
        assertThrows(NullPointerException.class, () -> calculator.divide(null, 1.0));
    }
}
