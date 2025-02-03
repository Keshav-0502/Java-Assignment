// 31. Write a program to remove duplicate elements from an array.

import java.util.LinkedHashSet;

public class Q31 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) set.add(num);

        System.out.println(set);
    }
}
