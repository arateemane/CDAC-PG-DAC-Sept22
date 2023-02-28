//How to Swap two Stringswithout using third (temporary) variable? 

import java.util.Scanner;
public class StrSwap{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string1 = ");
		String x = sc.next();
		System.out.println("Enter a string2 = ");
		String y = sc.next();
		
		x = x+y;
		y = x.substring(0,x.length()-y.length());
		x = x.substring(y.length());
		
		System.out.println("string1 = "+x);
		System.out.println("string2 = "+y);
		
	}
}

/*

Enter a string1 =
123
Enter a string2 =
564
string1 = 564
string2 = 123

E:\Desktop\after ccee\Assign3>java StrSwap
Enter a string1 =
abcd
Enter a string2 =
nhgf
string1 = nhgf
string2 = abcd

*/