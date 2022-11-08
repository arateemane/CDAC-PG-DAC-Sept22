/ Java program to demonstrate
// swap() method for IndexOutOfBoundsException
 
import java.util.*;
 
public class GFG1 {
    public static void main(String[] argv) throws Exception
    {
        try {
 
            // creating object of List<String>
            List<String> vector = new ArrayList<String>();
 
            // populate the vector
            vector.add("A");
            vector.add("B");
            vector.add("C");
            vector.add("D");
            vector.add("E");
 
            // printing the vector before swap
            System.out.println("Before swap: " + vector);
 
            // swap the elements
            System.out.println("\nTrying to swap elements"
                               + " more than upper bound index ");
            Collections.swap(vector, 0, 5);
 
            // printing the vector after swap
            System.out.println("After swap: " + vector);
        }
 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }
    