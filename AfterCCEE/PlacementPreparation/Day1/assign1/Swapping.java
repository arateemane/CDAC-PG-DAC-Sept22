//4. Swap two numberswithout using third variable approach 1. 

import java.util.Scanner;
public class Swapping
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number a = ");
		int a = sc.nextInt();
		System.out.println();
		System.out.print("Enter a second number b = ");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

/*
Enter a first number a = 5

Enter a second number b = 7
a = 7
b = 5
*/