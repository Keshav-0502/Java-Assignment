interface Calculator {
    int compute(int a, int b);
}

public class Q4 {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        
        System.out.println("Addition: " + addition.compute(10, 5));
        System.out.println("Subtraction: " + subtraction.compute(10, 5));
        System.out.println("Multiplication: " + multiplication.compute(10, 5));
    }
}