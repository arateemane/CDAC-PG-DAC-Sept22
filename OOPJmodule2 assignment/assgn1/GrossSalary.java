/*08.	In a company an employee is paid as under: If his basic salary is less than Rs.10000, 
then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, 
then HRA = Rs. 2000 and DA = 98% of basic salary. 
If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]*/




import java.util.Scanner;
class GrossSalary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basic salary = ");
		int s = sc.nextInt();
		int HRA, DA, GS;
		
		
		if(s<10000)
		{
			HRA = 10*s/100;
			DA = 90*s/100;
			GS = s+DA+HRA;
			System.out.println("Gross Salary is = "+GS);
		}
		else
		{
			HRA = 2000;
			DA = 98*s/100;
			GS = s+DA+HRA;
			System.out.println("Gross Salary is = "+GS);
		}
	}
}




/*

Enter basic salary = 253322
Gross Salary is = 503577

*/