//5. Write a java program to Count the Number of Vowelsin the given string. 

public class Vowelcount
{  
      static int vowelcount(String s)  
        {  
          int count=0;  
      
            char ch[]= new char[s.length()];     
            for(int i=0;i<s.length();i++)  
            {  
                ch[i]= s.charAt(i);  
                if( ch[i]=='A' || ch[i]=='a' || ch[i]=='E' || ch[i]=='e' || ch[i]=='I' || ch[i]=='i' || ch[i]=='O' || ch[i]=='o' || ch[i]=='U' || ch[i]=='u')  
                    count++;  
            }  
            return count;  
        }  
      public static void main(String[] args) {  
          String s ="    India Is My Country";  
         System.out.println(vowelcount(s) + " vowels.");   
    }  
}

//6 vowels.