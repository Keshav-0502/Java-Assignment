import java.util.ArrayList;
import java.util.Collections;

public class Q22 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add 10 integers to the list
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(1);
        numbers.add(12);
        
        System.out.println("Original list: " + numbers);
        
        // Sort the list
        Collections.sort(numbers);
        
        System.out.println("Sorted list: " + numbers);
    }
}