package joaopepe10.com.github.jUnit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {
    private double firstNumber;
    private double secondNumber;
    private double number;
    private SimpleMath math;

    @BeforeEach
    void setUp(){
        firstNumber = 6.2D;
        secondNumber = 2;
        math = new SimpleMath();
        number = 49D;
    }

    @Test
    void testSum(){
        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;
        assertEquals(expected, actual,
                () -> firstNumber + "+" + secondNumber + "did not produce " + expected);
        assertNotEquals(9.2D, actual);
        assertNotNull(actual);
    }

    @Test
    void testSubtraction(){
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;
        assertEquals(expected, actual, () -> firstNumber + "-" + secondNumber + "did not produce " + expected);
        assertNotEquals(5.2D, actual);
        assertNotNull(actual);
    }

    @Test
    void testMultiplication(){
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;
        assertEquals(expected, actual, () -> firstNumber + "*" + secondNumber + "did not produce " + expected);
        assertNotEquals(12.2D, actual);
        assertNotNull(actual);
    }

    @Test
    void testDivision(){
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3.1D;
        assertEquals(expected, actual, () -> firstNumber + "/" + secondNumber + "did not produce " + expected);
        assertNotEquals(3.2D, actual);
        assertNotNull(actual);
    }

    @Test
    void testMean(){
        Double actual = math.mean(firstNumber, secondNumber);
        double sum = math.sum(firstNumber, secondNumber);
        double expected = 4.1D;
        assertEquals(expected, actual, () -> firstNumber + "+" + secondNumber +"="  + sum + "/2" + "did not produce " + expected);
        assertNotEquals(3.2D, actual);
        assertNotNull(actual);
    }

    @Test
    void testSquareRoot(){
        Double actual = math.squareRoot(number);
        double expected = 7D;
        assertEquals(expected, actual, () -> number + "did not produce " + expected);
        assertNotEquals(3.2D, actual);
        assertNotNull(actual);
    }


}