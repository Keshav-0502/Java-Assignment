// 19. Write a program to check if a given number is odd or even.

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
        sc.close();
    }
}
