import java.util.Scanner;
    class smallest{
	 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number a = ");
	 int a=sc.nextInt();
	 System.out.println("Enter Number b = ");
	 int b=sc.nextInt();
	 System.out.println("Enter Number c = ");
	 int c=sc.nextInt();
	 
	     if(a<b && a<c)
	    {
		System.out.println("a = "+a+" is the smallest number");
		}
		else if(b<c)
		{
		System.out.println("b = "+b+" is the smallest number");
		}
		else 
		{
		System.out.println("c = "+c+" is the smallest number");
		}
    }
	}
	
	
	
	
	/*
Enter Number a =
5
Enter Number b =
6
Enter Number c =
8
a = 5 is the smallest number
*/