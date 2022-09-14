import java.util.Scanner;
class primefactor{
	public static void main(String ars[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number a= ");
		int a= sc.nextInt();
		
		for(int i=2;i*i<=a;i++)
		{
		    while(a % i == 0)
			{
			    a=a/i;
				System.out.print(i+" ");
			}
		}
		if(a!=1)
		{
		System.out.print(a);
		}
	}
}


/*
Enter number a=
65
5 13

*/