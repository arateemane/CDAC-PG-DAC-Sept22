/*
3. Write a class to represent complex numbers with necessary constructors. Write member functions to add, multiply
two complex numbers. There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to
initialize imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real part and the
imaginary part to user defined values. Also, write a main() function to (i) create two complex numbers 3+2i and 4-
2i; (ii) to print the sum and product of those numbers.
*/

import java.util.Scanner;
class Complex
{
	double a,b,x,y;
	
	Complex()
	{
		a = 0;
		b = 0;
		x = 0;
		y = 0;
	}
	
	Complex(double a, double x)
	{
		this.a = a;
		this.x = x;
	}
	
	Complex(double a, double b, double x, double y)
	{
		this.a = a;
		this.b = b;
		this.x = x;
		this.y = y;
	}

	void print(double sum1, double sum2, double mul1, double mul2)
	{
		System.out.println("Sum of Two Complex Numbers = "+sum1+" + ("+sum2+")i");
		System.out.println("Multiplication of Two Complex Numbers = "+mul1+" + ("+mul2+")i");
	}
}	
	
class ComplexNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Real part of first complex number = ");
		double a = sc.nextDouble();
		System.out.print("Enter Imaginary part of first complex number = ");
		double b = sc.nextDouble();
		System.out.print("Enter Real part of second complex number = ");
		double x = sc.nextDouble();
		System.out.print("Enter Imaginary part of second complex number = ");
		double y = sc.nextDouble();
		System.out.println("First complex no = "+a+" + ("+b+")i");
		System.out.println("First complex no = "+x+" + ("+y+")i");
		
		Complex c = new Complex();
		Complex c1 = new Complex(a, x);
		Complex c2 = new Complex(a,b,x,y);
		a = c2.a + c2.x;
		b = c2.b + c2.y;
		double m = c2.a * c2.x - c2.b * c2.y;
		double n = c2.a * c2.y + c2.b * c2.x;
		c2.print(a,b,m,n);
	}
}





/*

Enter Real part of first complex number = 3
Enter Imaginary part of first complex number = 2
Enter Real part of second complex number = 4
Enter Imaginary part of second complex number = -2
First complex no = 3.0 + (2.0)i
First complex no = 4.0 + (-2.0)i
Sum of Two Complex Numbers = 7.0 + (0.0)i
Multiplication of Two Complex Numbers = 16.0 + (2.0)i

*/
	
	
	
	
	
	
	
	