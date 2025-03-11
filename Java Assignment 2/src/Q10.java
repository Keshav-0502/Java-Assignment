public class Q10 {
    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + factorial(5));
            System.out.println("Factorial of -3: " + factorial(-3));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static long factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}