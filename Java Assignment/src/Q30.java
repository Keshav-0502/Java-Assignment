//  30. Write a program to search for an element in a sorted array using the binary search algorithm.
import java.util.Arrays;

public class Q30 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        int index = Arrays.binarySearch(arr, target);

        System.out.println("Element found at index: " + (index >= 0 ? index : "Not Found"));
    }
}
