/*5. Write a program to implement a class student with the following members. Name of the student. Marks of the
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning
of the above.*/




import java.util.Scanner;
class Student
{
	
	double average(double x, int y)
	{
		double avg = x / y;
		return avg; 
	}
	void display(String name, double m, double avg)
	{
		System.out.println("Name = "+name);
		System.out.println("Total Marks = "+m);
		System.out.println("Average marks = "+avg);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of Student = ");
	    String name = sc.nextLine();
		System.out.print("Enter number of Subjects = ");
		int sub = sc.nextInt();
	    double[] marks = new double[sub];
		
		double m = 0;
		for(int i=0; i < marks.length; i++)
		{
			System.out.print("Enter marks of subject"+(i+1)+" = ");
			marks[i] = sc.nextDouble();
			m = m + marks[i];
		}
		
		Student s1 = new Student();
		double b = s1.average(m,sub);
		s1.display(name, m, b);
	}
}



/*
Enter Name of Student = arati
Enter number of Subjects = 3
Enter marks of subject1 = 85
Enter marks of subject2 = 78
Enter marks of subject3 = 98
Name = arati
Total Marks = 261.0
Average marks = 87.0
*/