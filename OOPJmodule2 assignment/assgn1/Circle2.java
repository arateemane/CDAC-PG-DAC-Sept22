import java.util.Scanner;
class Circle2{
	double pi=3.14;
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle = ");
	double r = sc.nextDouble();
	double pi = 3.14;
	double A = pi*Math.pow(r,2);
	double P = 2*pi*r;
	System.out.println("Area of Circle = "+A);
	System.out.println("Area of Circle = "+P);
	}
}




/*
Enter radius of circle =
7
Area of Circle = 153.86
Area of Circle = 43.96
*/