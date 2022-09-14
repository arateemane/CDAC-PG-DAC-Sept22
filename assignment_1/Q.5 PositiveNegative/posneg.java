import java.util.Scanner;
    class posneg{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number = ");
	 int i=sc.nextInt();
		
		if(i>0)
		{
		 System.out.println("Given number is positive ");
		}
		else if(i<0)
		{
		 System.out.println("Given number is negative ");
		}
		else
		{
		System.out.println("Given number is neither positive nor negative ");
		}
	 }
 }
 
 
 
 /*
 Enter Number =
22
Given number is positive

C:\CDAC\1st 2DAY>java posneg
Enter Number =
-36
Given number is negative

C:\CDAC\1st 2DAY>java posneg
Enter Number =
0
Given number is neither positive nor negative
*/