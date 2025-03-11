public class Q7 {
    public static void main(String[] args) {
        // Try-catch
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Try-catch: " + e.getMessage());
        }
        
        // Try-catch-finally
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Try-catch-finally: " + e.getMessage());
        } finally {
            System.out.println("This block always executes");
        }
    }

}
