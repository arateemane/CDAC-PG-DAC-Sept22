//3. Write a java program to Reverse a Stringwithout using in-build function. 

import java.util.Scanner;
public class ReverseString
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String = ");
		String s = sc.next();
		
		for(int i=s.length();i>0;i--)
		{
			System.out.print(s.charAt(i-1));
		}
	}
}

/*
Enter String =
12345
54321
E:\Desktop\after ccee\Assign3>java ReverseString
Enter String =
arati
itara
*/