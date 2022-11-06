/*Q3.
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array. Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1*/


import java.util.Scanner;
class ArraySearch
{	
	int i=0;	
	int firstOccurence(String[] input, String x, int size)
	{ 		int res;
			
	        size--;
			if(size<0)
				return -1;
			if(x.equals(input[i]))
			{
				System.out.print(i);
				return 1;
			}
			i++;
				res = firstOccurence(input,x,size);
			if(res == -1)
				return -1;
			return res+1;
			
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
		
		ArraySearch a1 = new ArraySearch();
		int s = a1.firstOccurence(input, key,size);
		
		if(s == -1)
			//System.out.println(s);
		//else
			System.out.println("-1");
		
	}
}


/*

4
9 8 10 8
8
1



C:\CDAC\module 3\practise\assignment>java ArraySearch
4
9 8 10 8
4
-1
*/
