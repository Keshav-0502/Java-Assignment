import java.util.HashMap;
import java.util.Map;

public class Q23 {
    public static void main(String[] args) {
        // Create a HashMap to store employee IDs and names
        HashMap<Integer, String> employees = new HashMap<>();
        
        // Add employees
        employees.put(1001, "Keshav Sharma");
        employees.put(1002, "Saksham Chaudhary");
        employees.put(1003, "Vansh Bansal");
        employees.put(1004, "Aryan Dadwal");
        employees.put(1005, "Naman Panicker");
        
        // Print all employees
        System.out.println("Employees:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        // Find a specific employee
        int employeeId = 1003;
        String employee = employees.get(employeeId);
        System.out.println("\nEmployee with ID " + employeeId + ": " + employee);
    }
}