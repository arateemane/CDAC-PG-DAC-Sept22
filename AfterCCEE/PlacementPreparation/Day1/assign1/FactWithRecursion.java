//3. Find the Factorialof a number using Recursion. 


import java.util.Scanner;
public class FactWithRecursion
{
	public static int fact(int a)
	{
		if(a == 1)
			return 1;
		return a*fact(a-1);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a = sc.nextInt();
		System.out.println("Factorial is "+fact(a));
	}
}

/*
Enter a number =
6
Factorial is 720
*/