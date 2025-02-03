// Q6 Develop a program to implement multiple inheritance using interfaces.
interface Flyable {
    void fly();
    default void land() {
        System.out.println("Landing...");
    }
}

interface Swimmable {
    void swim();
    default void dive() {
        System.out.println("Diving...");
    }
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class Q6 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.land();
        duck.swim();
        duck.dive();
        
        // Demonstrate interface polymorphism
        Flyable flyingDuck = new Duck();
        Swimmable swimmingDuck = new Duck();
        
        flyingDuck.fly();
        swimmingDuck.swim();
    }
}

