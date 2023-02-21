//25. Write a Java Program to check whether the given number is Perfect Numberor NOT.

import java.util.Scanner;
class Perfect
{
	public static void main(String arg[])	
	{
	    long n,sum=0;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter a number");
                   n=sc.nextLong();
	    int i=1;
	    while(i<=n/2)
	    {
	       if(n%i==0)
	       {
		sum+=i;
	       }
	      i++;
	    }
	if(sum==n)
	{
	System.out.println(n+" is a perfect number");
               } 
	else
	System.out.println(n+" is not a  perfect number"); 
	}
}


/*
Enter a number
28
28 is a perfect number

E:\Desktop\after ccee\assign1>java Perfect
Enter a number
13
13 is not a  perfect number
*/