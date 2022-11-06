/*Q11. 

Given a string, compute recursively a new string where all 'x' chars have been removed.

Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 

Sample Input 1 :
xaxb
Sample Output 1:
ab

Sample Input 2 :
abc
Sample Output 2:
abc

Sample Input 3 :
xx
Sample Output 3:
*/
import java.util.Scanner;
class Removechar
{
	public static String removeX(String input)
	{
		if(input.length()<=1)
		{
			if(input.charAt(0)=='x')
			{
				return "";
			}
			else
				return input;
			}
		if(input.charAt(0)=='x')
		{
			input=input.substring(1);
			return removeX(input);
		}
		return input.charAt(0)+removeX(input.substring(1));
	}
	
	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
        System.out.println(removeX(S1));
    }
}


/*
C:\CDAC\module 3\practise\assignment>java Removechar
xaxb
ab

C:\CDAC\module 3\practise\assignment>java Removechar
abc
abc

C:\CDAC\module 3\practise\assignment>java Removechar
xx
*/