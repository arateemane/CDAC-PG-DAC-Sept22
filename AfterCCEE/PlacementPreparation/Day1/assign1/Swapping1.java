
//5. Swap two numberswithout using third variable approach 2. 


import java.util.Scanner;
public class Swapping1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number a = ");
		int a = sc.nextInt();
		System.out.println();
		System.out.print("Enter a second number b = ");
		int b = sc.nextInt();
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

/*
Enter a first number a = 7

Enter a second number b = 6
a = 6
b = 7
*/