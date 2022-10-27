/*05.	Write a program to read the days (eg. 670 days) as integer value using Scanner class.
 Now convert the entered days into complete years, months and days and print them.*/


import java.util.Scanner;
class Years{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of days = ");
		int D = sc.nextInt();
		int years, a, days, months;
		
		years = D/365;
		a = D%365;
		months = a/30;
		days = a%30;
		System.out.println("years/months/days = "+years+"/"+months+"/"+days);
	}
}




/*

Enter number of days = 670
years/months/days = 1/10/5

C:\CDAC\modul2\assgn1>javac years.java

C:\CDAC\modul2\assgn1>java years
Enter number of days = 10000
years/months/days = 27/4/25

*/