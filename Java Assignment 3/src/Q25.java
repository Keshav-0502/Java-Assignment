import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q25 {
    public static void main(String[] args) {
        // Email regex pattern
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        
        // Test email addresses
        String[] emails = {
            "ks.keshav05@gmail.com",
            "keshav.sharma11@s.amity.edu",
            "keshav-sharma-gmail",
            "Keshav@.com",
            "KEshav&amity."
        };
        
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address");
            } else {
                System.out.println(email + " is NOT a valid email address");
            }
        }
    }
}