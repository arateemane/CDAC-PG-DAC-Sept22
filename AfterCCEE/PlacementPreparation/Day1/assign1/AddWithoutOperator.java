//14. How to add two numbers without using the arithmetic operators in Java? 

import java.util.Scanner;
public class AddWithoutOperator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		
		while(b>0)
		{
			a++;
			b--;
		}
		
		System.out.println("sum is "+a);
	}
}

/*
a = 56
b = 566
sum is 622
*/