/*Given is the code to print numbers from 1 to n in increasing order recursively.
Input Format :
Integer n
Output Format :
Numbers from 1 to n (separated by space)
Constraints :
1 <= n <= 10000
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
Sample Input 2 :
 4
Sample Output 2 :
1 2 3 4

*/

import java.util.Scanner;
class PrintNumbers
{
	static int i = 1;
	static void printno(int n)
	{
		
		if(n == 0)
		return;
		
		if(n>0)
		{
			System.out.print(i+" ");
			i++;
			printno(n-1);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		printno(n);
	}
}


/*

C:\CDAC\module 3\practise\assignment>java PrintNumbers
6
1 2 3 4 5 6
C:\CDAC\module 3\practise\assignment>java PrintNumbers
4
1 2 3 4

*/