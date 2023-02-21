//20. Write a Java Program to print all the Prime Factorsof the Given Number. 

import java.util.Scanner;
class Primefactor{
	public static void main(String ars[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number a= ");
		int a= sc.nextInt();
		System.out.println("Enter number b= ");
		int b= sc.nextInt();
		
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
	


for(int i=2;i*i<=b;i++)
		{
		    while(b % i == 0)
			{
			    b=b/i;
				System.out.print(i+" ");
			}
		}
		if(b!=1)
		{
		System.out.print(b);
		}
	}
}

/*
Enter number a=
65
5 13

*/