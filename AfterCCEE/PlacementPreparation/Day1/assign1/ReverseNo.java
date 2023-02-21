//15. Write a java program to Reverse a given number.

import java.util.Scanner;
public class ReverseNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int rem = 0;
		while(a>0)
		{
			rem = a%10;
			System.out.print(rem);
			a = a/10;
		}
	}
}

/*
56662
26665
*/