//1. Check the given number is EVEN or ODD.

import java.util.Scanner;
public class EvenOdd
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a = sc.nextInt();
		
		if(a%2 == 0)
		{
			System.out.println("No. is Even");
		}
		else
		{
			System.out.println("No. is Odd");
		}
		
	
	}

}


/*
Enter a number =
15
No. is Odd

E:\Desktop\after ccee\assign1>java EvenOdd
Enter a number =
14
No. is Even
*/