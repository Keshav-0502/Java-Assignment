// Q8 Demonstrate the concept of constructors in OOP with a program.
class Student {
    private String name;
    private int age;
    private String course;

    // Default constructor
    Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor overloading
    Student(String name, int age, String course) {
        this(name, age);  // Constructor chaining
        this.course = course;
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.course = other.course;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + 
                         (course != null ? ", Course: " + course : ""));
    }
}

public class Q8 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Keshav", 20);
        Student s3 = new Student("Naman", 22, "Java");
        Student s4 = new Student(s3);  // Copy of s3

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}