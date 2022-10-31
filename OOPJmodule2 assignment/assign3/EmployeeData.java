/*3. Implement a class for a Person. Person has data members ‘age’, ’weight’, ‘height’, ‘dateOfBirth’,
‘address’ with proper reader/write methods etc. Now create two subclasses Employee and Student.
Employee will have additional data member ‘salary’, ‘dateOfJoining’, ‘experience’ etc. Student has data
members ‘roll’, ‘listOfSubjects’, their marks and methods ‘calculateGrade’. Again create two sub-classes
Technician and Professor from Employee. Professor has data members ‘courses’, ‘listOfAdvisee’ and
their add/remove methods. Write a main() function to demonstrate the creation of objects of different
classes and their method calls.
*/

import java.util.Scanner;
class Person
{
	double age;
	double weight;
	double height;
	String dateOfBirth;
	String address;
}

class Employee extends Person
{
	double salary;
	double dateOfJoining;
	double experience;
}

class Student extends Person
{
	int roll;
	String listOfSubjects;
	String grade;
	double percent ;
	
	Student()
	{
		age = 0.0;
		weight = 0.0;
	    height =0.0;
	    dateOfBirth = null;
	    address = null;
		roll = 0;
		listOfSubjects = null;
	}
	
	Student(double age,double weight,double height,String dateOfBirth, String address,int roll,String listOfSubjects)
	{
		this.age = age;
		this.weight = weight;
	    this.height =height;
	    this.dateOfBirth = dateOfBirth;
	    this.address = address;
		this.roll = roll;
		this.listOfSubjects = listOfSubjects;
	}
	void calculateGrade()
	{
		double sum = 0.0;
		double[] marks = new double[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<marks.length; i++)
		{
			System.out.print("Enter marks = ");
			marks[i] = sc.nextDouble();
			sum = sum + marks[i];
		}
		
		percent = (sum/400)*100;
		
		grade = (percent>75?"Distinction":(percent>60?"First":(percent>50?"Second":"Third")));
		
		System.out.println("Grade = "+grade);	
	}
	
	void printDetails()
	{
		
		System.out.println("\nAge = "+age+"\nWeight = "+weight+"\nHeight = "+height+"\nDate of Birth = "+dateOfBirth+"\nAddress = "+address+"\nRoll no = "+roll+"\nList of Subjects = "+listOfSubjects);
	}
}

class Technician extends Employee
{
	String name;
	Technician()
	{
		age = 0.0;
		weight = 0.0;
	    height =0.0;
	    dateOfBirth = null;
	    address = null;
		name = null;
	}
	
	Technician(double age,double weight,double height,String dateOfBirth, String address,String name)
	{
		this.age = age;
		this.weight = weight;
	    this.height =height;
	    this.dateOfBirth = dateOfBirth;
	    this.address = address;
		this.name = name;
	}
	
	void printDetails1()
	{
		System.out.println("Technician");
		System.out.println("\nAge = "+age+"\nWeight = "+weight+"\nHeight = "+height+"\nDate of Birth = "+dateOfBirth+"\nAddress = "+address+"\nName = "+name);
	}
	
}

class Professor extends Employee
{
	String courses;
	String listOfAdvisee;
	String name;
	
	Professor()
	{
		age = 0.0;
		weight = 0.0;
	    height =0.0;
	    dateOfBirth = null;
	    address = null;
		name = null;
		courses = null;
		listOfAdvisee = null;
	}
	
	Professor(double age,double weight,double height,String dateOfBirth, String address,String name,String courses,String listOfAdvisee)
	{
		this.age = age;
		this.weight = weight;
	    this.height =height;
	    this.dateOfBirth = dateOfBirth;
	    this.address = address;
		this.name = name;
		this.courses = courses;
		this.listOfAdvisee = listOfAdvisee;
	}
	
	void printDetails2()
	{
		
		System.out.println("\nAge = "+age+"\nWeight = "+weight+"\nHeight = "+height+"\nDate of Birth = "+dateOfBirth+"\nAddress = "+address+"\nName = "+name+"\nCourses = "+courses+"\nList of Advisee = "+listOfAdvisee);
	}
	
	
	void add(double age,double weight,double height,String dateOfBirth, String address,String name,String courses,String listOfAdvisee)
	{
		age = 26.0;
		weight = 58.5;
	    height = 5.2;
	    dateOfBirth = "22/01/1995";
	    address = "abc";
		name = "Pragati";
		courses = "Cdac";
		listOfAdvisee = "a, b, c, d ";
		
		
		System.out.println("\nAge = "+age+"\nWeight = "+weight+"\nHeight = "+height+"\nDate of Birth = "+dateOfBirth+"\nAddress = "+address+"\nName = "+name+"\nCourses = "+courses+"\nList of Advisee = "+listOfAdvisee);
	}
	
	void remove()
	{
		System.out.println("\nAge = "+0.0+"\nWeight = "+0.0+"\nHeight = "+0.0+"\nDate of Birth = "+null+"\nAddress = "+null+"\nName = "+null+"\nCourses = "+null+"\nList of Advisee = "+null);
	}
}


class EmployeeData
{
	public static void main(String args[])
	{
		Student stud1 = new Student(26.5,48.0,4.5,"22/12/1996", "abc",29,"Maths,History,Science,Geography");
		System.out.println("Student");
		stud1.printDetails();
		stud1.calculateGrade();
		System.out.println("=====================================================================================");
		
		Technician t1 = new Technician(45,60,5.0,"5/01/1954", "Satara","Suraj");
		t1.printDetails1();
	    System.out.println("=====================================================================================");
		
		Professor p1 = new Professor(55.0,50.2,6.0,"5/01/1976", "Mumbai","Johnson","Cdac","abc ghj klm");
		System.out.println("Professor");
		p1.printDetails2();
		System.out.println("=====================================================================================");
		
		System.out.println("Add");
		p1.add(57.0,65.0,6.4,"8/8/1980", "xyz","Akshay","MBA","asd cvb ghj frt");
		System.out.println("=====================================================================================");
		
		System.out.println("Remove");
		p1.remove();
		
		System.out.println("=====================================================================================");
		
	}
}



/*

Student

Age = 26.5
Weight = 48.0
Height = 4.5
Date of Birth = 22/12/1996
Address = abc
Roll no = 29
List of Subjects = Maths,History,Science,Geography
Enter marks = 87
Enter marks = 65
Enter marks = 74
Enter marks = 98
Grade = Distinction
=====================================================================================
Technician

Age = 45.0
Weight = 60.0
Height = 5.0
Date of Birth = 5/01/1954
Address = Satara
Name = Suraj
=====================================================================================
Professor

Age = 55.0
Weight = 50.2
Height = 6.0
Date of Birth = 5/01/1976
Address = Mumbai
Name = Johnson
Courses = Cdac
List of Advisee = abc ghj klm
=====================================================================================
Add

Age = 26.0
Weight = 58.5
Height = 5.2
Date of Birth = 22/01/1995
Address = abc
Name = Pragati
Courses = Cdac
List of Advisee = a, b, c, d
=====================================================================================
Remove

Age = 0.0
Weight = 0.0
Height = 0.0
Date of Birth = null
Address = null
Name = null
Courses = null
List of Advisee = null
=====================================================================================

*/






























































































































