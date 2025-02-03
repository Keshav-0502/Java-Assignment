//Q51. Implement a program to split a string into words and print each word on a new line.

public class Q51 {
    public static void main(String[] args) {
        String str = "Hello World from Java";
        for (String word : str.split(" ")) System.out.println(word);
    }
}
