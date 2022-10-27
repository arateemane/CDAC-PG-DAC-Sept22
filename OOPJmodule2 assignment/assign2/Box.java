/*6. Write a class Box that with three member-variables height, width and breadth. Write suitable
constructors to initialize them. Add functions like getVolume and getArea that will return volume and surface
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.
*/

import java.util.Scanner;
class Box
{
	Double h, w, b;
	
	Box()
	{
		h = 0.0;
		w = 0.0;
		b = 0.0;
	}
	
	Box(double h, double w, double b)
	{
		this.h = h;
		this.w = w;
		this.b = b;
	}
	
	double getVolume()
	{
		double v = h * w * b;
		return v;
	}
	
	double getArea()
	{
		double a = 2 * (h * w + w * b + h * b);
		return a;
	}
	
	void print(double v, double a)
	{
		System.out.println("Volume of Box = "+v);
		System.out.println("Surface area of Box = "+a);
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height = ");
		double h = sc.nextDouble();
		System.out.print("Enter width = ");
		double w = sc.nextDouble();
		System.out.print("Enter breadth = ");
		double b = sc.nextDouble();
		Box r = new Box(h,w,b);
		double v = r.getVolume();
		double a = r.getArea();
		r.print(v,a);
	}
}

/*
Enter height = 8.7
Enter width = 6.45
Enter breadth = 3.4
Volume of Box = 190.79099999999997
Surface area of Box = 215.24999999999997
*/







