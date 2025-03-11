import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Q9 {
    private static final Logger logger = Logger.getLogger(Q9.class.getName());
    
    public static void main(String[] args) {
        try {
            // Set up file logging
            FileHandler fileHandler = new FileHandler("age_errors.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            
            validateAge(15);
        } catch (InvalidAgeException e) {
            logger.warning("Invalid age: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18, got: " + age);
        }
        System.out.println("Age is valid: " + age);
    }
}