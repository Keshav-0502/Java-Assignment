//  Q23  Write a program to generate the first n terms of the Fibonacci series.
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 0, b = 1, sum;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
        sc.close();
    }
}
