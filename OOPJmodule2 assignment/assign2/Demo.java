/*7.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the
product. power() method that takes two integer numbers as parameter and returns the power of first number to
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four
methods of MathOperation class by providing entered numbers and prints the return values of every method.*/

import java.util.Scanner;
class MathOperation
{
	static int add(int x, int y)
	{
		int sum = x + y;
		return sum;
	}
	
	static int subtract(int x, int y)
	{
		int difference = x - y;
		return difference;
	}
	
	static int multiply(int x, int y)
	{
		int product = x * y;
		return product;
	}
	
	static int power(int x, int y)
	{
		int Power = (int)Math.pow(x,y);
		return Power;
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number = ");
		int x = sc.nextInt();
		System.out.print("Enter Second number = ");
		int y = sc.nextInt();
		
		int a = MathOperation.add(x,y);
		int b = MathOperation.subtract(x,y);
		int c = MathOperation.multiply(x,y);
		int d = MathOperation.power(x,y);
		
		System.out.println("Addition of two numbers = "+a);
		System.out.println("Subtraction of two numbers = "+b);
		System.out.println("Multiplication of two numbers = "+c);
		System.out.println("Power of first number to the second number = "+d);
	}
}



/*
Enter First number = 5
Enter Second number = 4
Addition of two numbers = 9
Subtraction of two numbers = 1
Multiplication of two numbers = 20
Power of first number to the second number = 625
*/