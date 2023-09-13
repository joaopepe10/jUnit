package joaopepe10.com.github.jUnit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    @Test
    void testSum(){
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(6.2D, 2D);
        double expected = 8.2D;
        assertEquals(expected, actual, "O testSum() nao produziu resultado esperado!");
        assertNotEquals(9.2D, actual);
        assertNotNull(actual);
    }

}