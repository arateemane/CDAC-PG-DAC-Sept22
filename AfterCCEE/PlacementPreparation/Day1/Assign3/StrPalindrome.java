//1. Write a java program to check Given String is Palindrome or NOT. 

import java.util.Scanner;
public class StrPalindrome{

	public static boolean pali(String s,int i)
	{
		if(i==s.length()/2) return true;
		
		if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
					
		return pali(s,i+1);
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String = ");
		String s = sc.next();
		if(pali(s,0)==true)
			System.out.println("Yes, string is palindrome..");
		else	
			System.out.println("No, string is not palindrome..");
	}

}

/*

Enter a String = madam
Yes, string is palindrome..

E:\Desktop\after ccee\Assign3>java StrPalindrome
Enter a String = mnsd
No, string is not palindrome..

E:\Desktop\after ccee\Assign3>
E:\Desktop\after ccee\Assign3>java StrPalindrome
Enter a String = 1234
No, string is not palindrome..

E:\Desktop\after ccee\Assign3>java StrPalindrome
Enter a String = 12321
Yes, string is palindrome..

*/