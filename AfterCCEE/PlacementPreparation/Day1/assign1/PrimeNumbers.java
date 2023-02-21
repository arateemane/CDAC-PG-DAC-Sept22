//22. Write a Java Program to print Prime Numbers from 1 to N. 

import java.util.Scanner;
public class PrimeNumbers
{
   
   public static void main(String args[])
   {
      int i,n,counter, j;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the n value : ");
      n=sc.nextInt();
      System.out.print("Prime numbers between 1 to "+n+" are ");
      for(j=2;j<=n;j++)
	  {
         counter=0;
         for(i=1;i<=j;i++)
		 {
            if(j%i==0)
			{
               counter++;
            }
         }
         if(counter==2)
         System.out.print(j+" ");
      }
   }
}

/*
Enter the n value : 10
Prime numbers between 1 to 10 are 2 3 5 7
E:\Desktop\after ccee\assign1>java PrimeNumbers
Enter the n value : 100
Prime numbers between 1 to 100 are 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/