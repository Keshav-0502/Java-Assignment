import java.io.File;
import java.io.IOException;

public class Q16 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        
        if (file.exists()) {
            System.out.println("File exists at: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist, creating now...");
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully at: " + file.getAbsolutePath());
                } else {
                    System.out.println("Failed to create the file");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}