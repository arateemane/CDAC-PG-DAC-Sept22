//2. Write a Java Program to find the Factorialof given number. 

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a = sc.nextInt();
		int fact = 1;
		
		while(a>0)
		{
			fact = fact*a;
			a--;
		}
		
		System.out.println("Factorial of a given number = "+fact);
	}
}

/*
Enter a number =
5
Factorial of a given number = 120
*/