//07.	Write a program to swap two numbers without using third variable.


import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number a = ");
		int a = sc.nextInt();
		System.out.print("Enter second number b = ");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("First number a after swap = "+a);
		System.out.print("Second number b after swap = "+b);
		
	}
}



/*

Enter first number a = 24
Enter second number b = 44
First number a after swap = 44
Second number b after swap = 24

*/