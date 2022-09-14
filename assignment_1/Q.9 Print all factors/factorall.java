import java.util.Scanner;
class factorall{
	public static void main(String ars[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number= ");
		int a= sc.nextInt();
		int fact=0;
		int n=a/2;
		for(int i=1;i<=n;i++)
			{
			if(a%i==0)
			    {
			     System.out.println(" Factor = "+i);
				
				}
		    }
			
	}
}

/*
Enter any number=
40
 Factor = 1
 Factor = 2
 Factor = 4
 Factor = 5
 Factor = 8
 Factor = 10
 Factor = 20   */