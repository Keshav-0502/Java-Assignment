public class Q21 {
    public static void main(String[] args) {
        double randomValue = Math.random();
        System.out.println("Random value: " + randomValue);
        
        int negativeNumber = -69;
        int absoluteValue = Math.abs(negativeNumber);
        System.out.println("Absolute value of " + negativeNumber + " is " + absoluteValue);
        
        double base = 2.0;
        double exponent = 3.0;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }
}