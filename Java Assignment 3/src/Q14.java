import java.io.FileWriter;
import java.io.IOException;

public class Q14 {
    public static void main(String[] args) {
        String data = "Writing data using FileWriter";
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write(data);
            System.out.println("Data written to file successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
