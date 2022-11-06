/*Q4.
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1). Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
last index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
3
*/


import java.util.Scanner;
class ArrayLastOccurence
{	
		
			
	int lastOccurence(String[] input, String x, int index)
	{		
			if(index < 0)
			return -1;	
		
			if(x.equals(input[index]))
				{
					return index;
				}
		
			return lastOccurence(input,x,index-1);
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
		
		ArrayLastOccurence a1 = new ArrayLastOccurence();
		int s = a1.lastOccurence(input, key,size-1);
		
		if(s == -1)
			System.out.println("-1");
		else
			System.out.println(s);
		
	}
}

/*

C:\CDAC\module 3\practise\assignment>java ArrayLastOccurence
4
9 8 10 8
8
3

C:\CDAC\module 3\practise\assignment>java ArrayLastOccurence
4
9 8 10 8
2
-1

*/