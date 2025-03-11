import java.io.*;

public class Q15 {
    public static void main(String[] args) {
        // Writing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"))) {
            writer.write("I have written into file");
            System.out.println("Data written to file successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Reading
        try (BufferedReader reader = new BufferedReader(new FileReader("buffered.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}