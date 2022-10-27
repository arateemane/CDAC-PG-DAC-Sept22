/*03.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class.
 Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/


import java.util.Scanner;
class Percent{

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double arr[] = new double[5];
	
	double sum = 0.0;
	double per = 0.0;
	
	for(int i=0; i<arr.length; i++)
	{	
	    arr[i] = sc.nextDouble();
		sum = sum + arr[i];
	}
	System.out.println("Sum of Marks = "+sum);
	
	per = (sum*100)/500;
	System.out.println("Percentage of Marks = "+per+"%");
	}
}
	
	
	
/*
	
86
78
86
87
65
Sum of Marks = 402.0
Percentage of Marks = 80.4%

*/