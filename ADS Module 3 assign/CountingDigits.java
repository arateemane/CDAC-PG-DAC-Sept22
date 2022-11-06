/*Q6.
Given the code to find out and return the number of digits present in a number recursively. 
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1   */


import java.util.Scanner;
class CountingDigits
{
	static int ct = 0;
	static int count(int n)
	{
		if(n == 0)
			return 0;
		else
		{
			++ct;
			n = (int) n/10;
			 count(n);
		}
		
		return ct;
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(count(n));
	}
}


/*

C:\CDAC\module 3\practise\assignment>java CountingDigits
 156
3
C:\CDAC\module 3\practise\assignment>java CountingDigits
 7
1

*/