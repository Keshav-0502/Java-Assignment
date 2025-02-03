// Q15 Write a program to check if a number is prime using a while loop.
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = num > 1;
        int i = 2;

        while (i * i <= num) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        System.out.println(num + " is " + (isPrime ? "a prime number." : "not a prime number."));
        sc.close();
    }
}
