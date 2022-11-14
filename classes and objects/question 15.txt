import java.io.*;

 class CheckProperties {

    public static void main(String args[]) {
        String a = "100";
        String b = "100";

        // Printing the hashcodes of a and b
        System.out.println("HashCode of a = " + a + ": " + a.hashCode());
        System.out.println("HashCode of b = " + b + ": " + b.hashCode());

        // Declaring a different variable
        String c = "500";

        // Printing the hashcode of c
        System.out.println("HashCode of c = " + c + ": " + c.hashCode());

        // Second Computation of a's hashcode
        System.out.println("HashCode of a = " + a + ": " + a.hashCode());
    }
}