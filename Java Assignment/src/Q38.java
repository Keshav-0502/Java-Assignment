// Q38. Implement a program to demonstrate the use of a copy constructor in Java.

class CopyConstructor {
    int x;

    CopyConstructor(int x) {
        this.x = x;
    }

    CopyConstructor(CopyConstructor obj) {
        this.x = obj.x;
    }
}

public class Q38 {
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(10);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        System.out.println("Copy Value: " + obj2.x);
    }
}
