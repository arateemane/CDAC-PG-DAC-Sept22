//8. Write a Java Program to find whether given number is Leap year or NOT? 

import java.util.Scanner;
public class Leap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year (number) = ");
		int a = sc.nextInt();
		
		if(a%100 == 0)
		{
			if(a%400 == 0)
				System.out.println("Yes...it is a leap year");
			else
				System.out.println("No...it is not a leap year");
		}
		else 
		{
			if(a%4 == 0)
				System.out.println("Yes...it is a leap year");
			else
				System.out.println("No...it is not a leap year");
		}
	}
}


/*
Enter a year (number) =
100
No...it is not a leap year

E:\Desktop\after ccee\assign1>java Leap
Enter a year (number) =
2000
Yes...it is a leap year

E:\Desktop\after ccee\assign1>java Leap
Enter a year (number) =
2011
No...it is not a leap year

E:\Desktop\after ccee\assign1>java Leap
Enter a year (number) =
2012
Yes...it is a leap year1
*/