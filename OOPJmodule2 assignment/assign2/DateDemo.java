/*2. Implement a class for DateDemo. Write member functions for (i) getting the previous day, (iv) getting the next
day, (iii) printing a day There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; (ii)
day is initialized to user specified value but month and year are initialized to 01, 1970; (iii) day, month are
initialized to user specified value but year is initialized to 1970; (iv) day, month and year are initialized to user
defined values. Also, write a main() function to (i) create a date object; (ii) print the next and the previous day.*/


import java.util.Scanner;
class Demo
{
	int day;
	int month;
	int year;
	
	Demo()
	{
		day = 01;
		month = 01;
		year = 1970;
	}
	
	Demo(int day)
	{
		this.day = day;
		month = 01;
		year = 1970;
	}
	
	Demo(int day, int month)
	{
		this.day = day;
		this.month = month;
		year = 1970;
	}
	Demo(int day, int month, int year )
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	int getPreviousDay()
	{  
		if(day == 1)
		{
			int ch = month;
			switch(ch)
			{
				case 1 : day = 31;
						 month = month + 11;
						 year = year - 1;
						break;
				case 2 :
				case 5 :
				case 7 :
				case 8 :
				case 10:
				case 12: day = 30;
						month = month - 1;
						break;
				case 3 : day = 28;
						month = month - 1;
				        break;
				case 4 :
				case 6 :
				case 9 :
				case 11: day = 31;
						month = month - 1;
						break;
			}
			return day;
		}
			
		else
		{
			day = day - 1;
			return day;
		}
	}
	
	int getNextDay()
	{
		if(day == 31 || day == 30)
		{
			int ch = month;
			switch(ch)
			{
				case 12:day = 2;
				        month = 1;
						year = year + 1;
						break;
				default: day = 2;
						month = month +1;
						break;
			}return day;
		}
		else
		{
			day = day + 2;
			return day;
		}
	}
	
	
	void printDay()
	{
		System.out.println("Previous day is = "+getPreviousDay()+"/"+month+"/"+year);
		System.out.println("Next day is = "+getNextDay()+"/"+month+"/"+year);
	}
}	
	
class DateDemo
{	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a day = ");
	int day = sc.nextInt();
	System.out.print("Enter a month = ");
	int month = sc.nextInt();
	System.out.print("Enter a year = ");
	int year = sc.nextInt();
	
	System.out.println("===================Zero-arg constructor output============================================");
	Demo d1 = new Demo();
	d1.printDay();
	System.out.println("=====================1-arg constructor output=============================================");
	Demo d2 = new Demo(day);
	d2.printDay();
	System.out.println("=====================2-arg constructor output=============================================");
	Demo d3 = new Demo(day, month);
	d3.printDay();
	System.out.println("=====================3-arg constructor output=============================================");
	Demo d4 = new Demo(day, month, year);
	d4.printDay();
	System.out.println("==========================================================================================");

	}
}



/*
Enter a day = 22
Enter a month = 1
Enter a year = 1995
===================Zero-arg constructor output============================================
Previous day is = 31/12/1969
Next day is = 2/1/1970
=====================1-arg constructor output=============================================
Previous day is = 21/1/1970
Next day is = 23/1/1970
=====================2-arg constructor output=============================================
Previous day is = 21/1/1970
Next day is = 23/1/1970
=====================3-arg constructor output=============================================
Previous day is = 21/1/1995
Next day is = 23/1/1995
==========================================================================================

*/