//16. Write a Java Program to find GCD of two given numbers. 

import java.util.Scanner;
public class GCD
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		int gcd = 1;
		
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i == 0 && b%i == 0)
			{
					gcd = i;
			}
		}
		
		System.out.println("GCD is "+gcd);
	}
}

/*
a = 52
b = 12
GCD is 4

E:\Desktop\after ccee\assign1>java GCD
a = 6
b = 4
GCD is 2

E:\Desktop\after ccee\assign1>java GCD
a = 65
b = 52
GCD is 13
*/