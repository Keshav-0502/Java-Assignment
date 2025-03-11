import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}