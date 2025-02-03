// Q16. Create a program to calculate the factorial of a number using recursion.
import java.util.Scanner;

public class Q16 {
    static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Factorial: " + factorial(num));
        sc.close();
    }
}
