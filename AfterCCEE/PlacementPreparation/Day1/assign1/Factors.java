//11. Write a Java Program to print all the Factors of the Given number.

import java.util.Scanner;
public class Factors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int n = a/2;
		System.out.println("Factors are ...");
		for(int i=1;i<n;i++)
		{
			if(a%i == 0)
			{
				System.out.println(i);
			}
		}
	}
}

/*
56
Factors are ...
1
2
4
7
8
14
*/