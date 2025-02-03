// Q13 Write a program to declare variables of all primitive data types in Java and print their default values.
public class Q13 {
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;
    static boolean booleanVar;
    
    public static void main(String[] args) {
        System.out.println("Default values of primitive data types:");
        System.out.println("byte: " + byteVar);          // 0
        System.out.println("short: " + shortVar);        // 0
        System.out.println("int: " + intVar);            // 0
        System.out.println("long: " + longVar);          // 0L
        System.out.println("float: " + floatVar);        // 0.0f
        System.out.println("double: " + doubleVar);      // 0.0d
        System.out.println("char: " + (int)charVar);     // 0 ('\u0000')
        System.out.println("boolean: " + booleanVar);    // false
        
        // Max and min values
        System.out.println("\nRanges of primitive data types:");
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
    }
}