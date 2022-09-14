import java.util.Scanner;
    class lcm{
	 public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number a = ");
	     int a=sc.nextInt();
	     System.out.println("Enter Number b = ");
	     int b=sc.nextInt();
		 int LCM=1;
		 int hcf=1;
		 for(int i=1;i<=a && i<=b;i++)
		    {
			if(a % i == 0 && b % i == 0)
			hcf=i;
		    LCM=a*b/hcf;
			}
		System.out.println("LCM of "+a+" and "+b+" is "+LCM);
	}
	}  
	
	
/*
Enter Number a =
5
Enter Number b =
15
LCM of 5 and 15 is 15   */






		
		