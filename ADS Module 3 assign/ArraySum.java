/*
Given an array of length N, you need to find and return the sum of all elements of the array. Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7  
*/


import java .util.Scanner;

class ArraySum
{
	static int sumArray(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}

public static void main(String[] args)
	{
		String[] input;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		input = new String[size];
		sc.nextLine();
		input = sc.nextLine().split(" ");
		int arr[] = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			arr[i] = Integer.parseInt(input[i]);
		}
		int Sum = sumArray(arr);
		System.out.println(Sum);
		
	}
}

/*

C:\CDAC\module 3\practise\assignment>java ArraySum
3
9 8 9
26

C:\CDAC\module 3\practise\assignment>java ArraySum
3
4 2 1
7

*/