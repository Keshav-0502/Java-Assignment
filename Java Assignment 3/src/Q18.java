import java.io.*;

public class Q18 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("source.txt");
             FileOutputStream fos = new FileOutputStream("destination.txt")) {
            
            byte[] buffer = new byte[1024];
            int length;
            
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            
            System.out.println("File copied successfully");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
