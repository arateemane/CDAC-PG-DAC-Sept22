//12. Write a Java Program to find sum of the digits of a given number.

import java.util.Scanner;
public class DigitSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int rem = 0;
		int sum = 0;
		while(a>0)
		{
			rem = a%10;
			sum = sum+rem;
			a = a/10;
		}
		
		System.out.println("sum = "+sum);
	}
}

/*
5662
sum = 19
*/