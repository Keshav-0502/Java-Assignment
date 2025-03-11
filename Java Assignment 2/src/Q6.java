import java.util.function.Function;

public class Q6 {
    public static int square(int n) {
        return n * n;
    }
    
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = Q6::square;
        System.out.println("Square of 5: " + squareFunction.apply(5));
    }
}