// Q12 Write a program to demonstrate the immutability of the String class.
public class Q12{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;
        
        System.out.println("Original strings:");
        System.out.println("str1: " + str1 + ", hashcode: " + str1.hashCode());
        System.out.println("str2: " + str2 + ", hashcode: " + str2.hashCode());
        
        str1 = str1 + " World";  // Creates new string object
        
        System.out.println("\nAfter modification:");
        System.out.println("str1: " + str1 + ", hashcode: " + str1.hashCode());
        System.out.println("str2: " + str2 + ", hashcode: " + str2.hashCode());
        
        String str3 = "Hello";
        System.out.println("\nString pool example:");
        System.out.println("str2 == str3: " + (str2 == str3));
        System.out.println("str2.equals(str3): " + str2.equals(str3));
    }
}
