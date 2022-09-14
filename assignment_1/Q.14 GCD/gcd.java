import java.util.Scanner;
    class gcd{
	 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number a = ");
	     int a=sc.nextInt();
	     System.out.println("Enter Number b = ");
	     int b=sc.nextInt();
		 int hcf=1;
		 for(int i=1;i<=a && i<=b;i++)
		    {
			if(a % i == 0 && b % i == 0)
			hcf=i;
			}
		System.out.println("GCD of "+a+" and "+b+" is "+hcf);
	}
	}
	
	/*
Enter Number a =
12
Enter Number b =
60
GCD of 12 and 60 is 12
*/