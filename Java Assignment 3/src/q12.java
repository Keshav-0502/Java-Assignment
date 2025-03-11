import java.io.FileOutputStream;
import java.io.IOException;

public class q12 {
    public static void main(String[] args) {
        String data = "we are very good students";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data written to file successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}