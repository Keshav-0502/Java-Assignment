// Q41 Implement a singleton class in Java.
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}

public class Q41 {
    public static void main(String[] args) {
        Singleton.getInstance();
        System.out.println("Singleton instance created.");
    }
}
