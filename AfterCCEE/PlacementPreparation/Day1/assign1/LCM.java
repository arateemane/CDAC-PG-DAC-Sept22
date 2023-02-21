//17. Write a java program to LCM of TWO given number. 

import java.util.Scanner;
public class LCM
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
		
		int lcm = a*b/gcd;
		
		System.out.println("GCD is "+lcm);
	}
}

/*
a = 4
b = 6
GCD is 12

E:\Desktop\after ccee\assign1>java LCM
a = 45
b = 15
GCD is 45
*/