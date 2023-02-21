//19. Check whether the Given Numberis a Palindrome or NOT. 

import java.util.Scanner;
    class Palindrome{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number = ");
	     int a=sc.nextInt();
         int num=a;
		 int b=1,N=0;		 
	    while(num!=0)
		{
			b=num%10;
			N=N*10+b;     
			num=num/10;                    
		}
		if(N==a)
		{
		System.out.println("Entered number is Palindrome");
		}
		else
		{
		System.out.println("Entered number is not Palindrome");
		}
	}
}
	
/*
Enter Number =
12321
Entered number is Palindrome

E:\Desktop\after ccee\assign1>java Palindrome
Enter Number =
45612
Entered number is not Palindrome
*/
	
	
	
	