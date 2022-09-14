import java.util.Scanner;
    class fact{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number = ");
	 int i=sc.nextInt();
	 int fact=1,N=i;	
		 while(N>0)
		{
		     fact=N*fact;
			 N--;
		}
		{
		System.out.println("The factorial of given number is= "+fact);
		}
	 }
 }