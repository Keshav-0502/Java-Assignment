// Q 4) Write a program to demonstrate method overloading and method overriding.
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    // Method Overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    
    // Method Overloading
    void makeSound(String time) {
        System.out.println("Dog barks at " + time);
    }
    
    void makeSound(int count) {
        for(int i = 0; i < count; i++) {
            System.out.println("Woof!");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();        // Overridden method
        dog.makeSound("night"); // Overloaded with String
        dog.makeSound(2);       // Overloaded with int
        
        Animal animal = new Dog();
        animal.makeSound();     
    }
}