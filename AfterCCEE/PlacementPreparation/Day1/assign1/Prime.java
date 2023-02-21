//21. Write a Java Program to check whether the Given Number is Prime Number or NOT. 

import java.util.Scanner;
class Prime{
	public static void main(String ars[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number= ");
		int a= sc.nextInt();
		int fact=0;
		int n=a/2;
		for(int i=1;i<=n;i++)
			if(a%i==0)
			    {
				fact++;
			    }
				if (fact>2)
				{
					System.out.println("Given number is not prime");
			    }
			    else
			    {
					System.out.println("Given number is prime");
		        }
	}
}




/*Enter any number=
87
Given number is not prime


Enter any number=
23
Given number is prime*/