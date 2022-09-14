import java.util.Scanner;
    class evenodd{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Number = ");
	 int i=sc.nextInt();
		
		if(i%2==0)
		{
		System.out.println("Given number is Even ");
		}
		else
		{
		System.out.println("Given number is Odd ");
		}
	 }
 }
 
 
 
 
 /*Enter Number =
4569
Given number is Odd

C:\CDAC\1st 2DAY>java evenodd
Enter Number =
246668
Given number is Even*/