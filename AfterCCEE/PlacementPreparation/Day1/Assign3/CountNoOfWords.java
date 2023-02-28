//9. How do you count the Number of Wordsin a given String using Split method? 

public class CountNoOfWords {
 
    public static void main(String[] args) {
 
        String str = "Java programming question";
        
        if (str == null || str.isEmpty()) {
               return;
        }
 
        System.out.println(str.split("\\s+").length);
    } 
}

//3