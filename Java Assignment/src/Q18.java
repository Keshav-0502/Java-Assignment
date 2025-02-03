//  18. Write a program to find the largest and smallest numbers in an array.
public class Q18 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 67, 34, 89, 1};
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}
