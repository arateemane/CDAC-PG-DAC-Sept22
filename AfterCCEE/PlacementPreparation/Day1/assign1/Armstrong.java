//23. Write a Java Program to check whether the given number is Armstrong Numberor NOT.

import java.util.Scanner;
class Armstrong{
	public static void main(String ars[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter 3 digit number= ");
	int a= sc.nextInt();
	int b=a;
	int var=0;
	int sum=0;
	while(b>0)
		{
		var=b%10;
		sum=sum+var*var*var;
		b=b/10;
		}
		if(sum==a)
		{
			System.out.println("Entered number is Armstrong ");
			}
	    else
		{
			System.out.println("Entered number is not Armstrong ");
			}
    }
	}
	
	
	
	
/*Enter 3 digit number=
153
Entered number is Armstrong


Enter 3 digit number=
236
Entered number is not Armstrong*/