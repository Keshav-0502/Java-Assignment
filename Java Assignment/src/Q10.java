// Q10 Show an example of the final keyword for variables, methods, and classes.
final class Parent {
    final String COMPANY = "TechCorp";  
    final double PI = 3.14159;          
    
    final void display() {              
        System.out.println("Company: " + COMPANY);
    }
}


class Employee {
    final int id;                       
    
    Employee(int id) {
        this.id = id;                   
    }
    
    void process() {
        final int CODE = 100;           
        System.out.println("ID: " + id + ", Code: " + CODE);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        
        Employee emp = new Employee(1001);
        emp.process();
    }
}
