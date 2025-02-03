// Q36. Write a program to demonstrate operator precedence in Java.
class ParameterizedConstructor {
    String name;

    ParameterizedConstructor(String name) {
        this.name = name;
    }
}

public class Q36 {
    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("Keshav");
        System.out.println("Name: " + obj.name);
    }
}