public class RecursiveFactorialSolution {
    
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative input not allowed");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
