import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Zack");
        
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        
        System.out.println("Sorted names in descending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}