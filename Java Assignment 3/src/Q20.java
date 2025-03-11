import java.io.RandomAccessFile;
import java.io.IOException;

public class Q20 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("random.txt", "rw")) {
            // Write data
            file.writeBytes("KEshav ShaRma");
            
            file.seek(6);
            file.writeBytes("Java");
            
            // Read
            file.seek(0);
            byte[] bytes = new byte[(int) file.length()];
            file.readFully(bytes);
            String content = new String(bytes);
            
            System.out.println("File content: " + content);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}