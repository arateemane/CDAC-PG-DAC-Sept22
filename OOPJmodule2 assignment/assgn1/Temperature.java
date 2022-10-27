//06.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]


import java.util.Scanner;
class Temperature{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit = ");
		int F = sc.nextInt();
		int C;
		
		C = (F-32)*5/9;
		
		System.out.print("Temperature in Celsious = "+C);
	}
}




/*

Enter temperature in Fahrenheit = 246
Temperature in Celsious = 118

*/