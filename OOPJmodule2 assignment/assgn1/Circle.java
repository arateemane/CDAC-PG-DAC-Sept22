/*02.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.*/

import java.util.Scanner;
class Circle
{
	static double PI=3.14;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle = ");
		double r = sc.nextDouble();
		
		
		Circle obj1 = new Circle();
		double Area = obj1.areaOfCircle(r,PI);
		System.out.println("Area of Circle = "+Area);
		Circle obj2 = new Circle();
		double Circumference = obj2.CircumferenceOfCircle(r,PI);
		System.out.println("Area of Circle = "+Circumference);
	}
	
	
	double areaOfCircle(double r,double p)
	{
		double A = p * Math.pow(r,2);
		return A;
	}
	
	double CircumferenceOfCircle(double r,double p)
	{
		double C = 2 * p * r;
		return C;
	}
	
}



/*
Enter radius of circle = 6
Area of Circle = 113.04
Area of Circle = 37.68
*/