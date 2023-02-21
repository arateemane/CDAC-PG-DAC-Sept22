//7. How to check the given number is Positive or Negative in Java? 

import java.util.Scanner;
public class PositiveNegative
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a = sc.nextInt();
		
		if(a > 0)
		{
			System.out.println("No. is Positive");
		}
		else
		{
			System.out.println("No. is Negative");
		}
		
	
	}
}

/*
Enter a number =
-4
No. is Negative

E:\Desktop\after ccee\assign1>java PositiveNegative
Enter a number =
6
No. is Positive
*/