// Q7) Write a Java program to showcase the use of this and super keywords.
class Vehicle {
    String brand;
    
    Vehicle(String brand) {
        this.brand = brand;
    }
    
    void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;
    
    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    
    void display() {
        super.display();
        System.out.println("Model: " + this.model);
    }
    
    void compare(Car other) {
        System.out.println("Comparing " + this.brand + " with " + other.brand);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");
        
        car1.display();
        car1.compare(car2);
    }
}