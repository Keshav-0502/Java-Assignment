import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Q24 {
    public static void main(String[] args) {
        // Using Date class
        Date currentDate = new Date();
        System.out.println("Current date and time: " + currentDate);
        
        // Format the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Formatted date: " + formattedDate);
        
        // Using Calendar class
        Calendar calendar = Calendar.getInstance();
        System.out.println("\nCalendar Information:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Month is 0-based
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));
    }
}