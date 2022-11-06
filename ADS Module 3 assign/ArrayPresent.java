/*Q2.
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false. Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false

*/

import java.util.Scanner;
class ArrayPresent
{	
		
	int presentee(String[] input, String x, int size)
	{ 
	        size--;
			if(size<1)
				return 0;
			if(x.equals(input[size]))
				return 1;
			else
				return presentee(input,x,size);
		
	}
	
	public static void main(String[] args)
	{
		String[] input;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		input = new String[size];
		sc.nextLine();
		input = sc.nextLine().split(" ");
		
		//size = input.length;
		String key = sc.next(); 
		
		ArrayPresent a1 = new ArrayPresent();
		int s = a1.presentee(input, key,size);
		
		if(s == 1)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}

/*

C:\CDAC\module 3\practise\assignment>java ArrayPresent
3
9 8 10
8
true

C:\CDAC\module 3\practise\assignment>java ArrayPresent
3
9 8 10
2
false

*/