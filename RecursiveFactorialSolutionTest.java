import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveFactorialSolutionTest {

    RecursiveFactorialSolution solution = new RecursiveFactorialSolution();

    @Test
    public void testFactorialZero() {
        assertEquals(1, solution.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, solution.factorial(1));
    }

    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(120, solution.factorial(5));
        assertEquals(3628800, solution.factorial(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        solution.factorial(-3);
    }
}
