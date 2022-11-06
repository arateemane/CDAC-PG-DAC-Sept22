/1.*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
 Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints :
1 <= x <= 30
0 <= n <= 30
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
*/

import java.util.Scanner;
class Power1
{
	static String fun(String x, String n)
	{
	
		
			if(n == 0)
			{
				return 1;
			}
			
			return "x*fun(x,n-1)";
		
	}
	
	
	public static void main(String[] args)
	{
		String[] input;
		String x,n;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine().split(" ");
		x = input[1];
		n = input[2];
		System.out.println(fun(x,n));
	}
}


/*

C:\CDAC\module 3\practise\Practice>java Power1
 3 4
81

C:\CDAC\module 3\practise\Practice>java Power1
 2 5
32


*/