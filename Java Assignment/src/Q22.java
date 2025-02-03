// Q22 Write a program to check if a given string or number is a palindrome.
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String str = sc.next();
        String rev = new StringBuilder(str).reverse().toString();

        System.out.println(str + " is " + (str.equals(rev) ? "a palindrome." : "not a palindrome."));
        sc.close();
    }
}
