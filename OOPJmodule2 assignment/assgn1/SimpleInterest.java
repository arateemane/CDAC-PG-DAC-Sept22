/*04.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.*/


import java.util.Scanner;
class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle = ");
		double P = sc.nextDouble();
		System.out.print("Enter Rate = ");
		double R = sc.nextDouble();
		System.out.print("Enter Time in years = ");
		double T = sc.nextDouble();
		double SI;
			
			SI = P*R*T/100;
			
			
		System.out.println("Simple Interest is equal to = "+SI);
	
	}
}



/*

Enter Principle = 5000
Enter Rate = 4.5
Enter Time in years = 6
Simple Interest is equal to = 1350.0

*/