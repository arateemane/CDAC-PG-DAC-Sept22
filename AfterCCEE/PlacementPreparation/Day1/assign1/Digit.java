//10. Write a Java Program to print the digits of a Given Number. 

import java.util.Scanner;
public class Digit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int rem = 0;
		while(a>0)
		{
			rem = a%10;
			System.out.println(rem);
			a = a/10;
		}
	}
}

/*
E:\Desktop\after ccee\assign1>java Digit
54
4
5
*/