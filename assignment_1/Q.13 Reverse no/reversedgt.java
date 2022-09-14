import java.util.Scanner;
    class reversedgt{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number = ");
	     int a=sc.nextInt();
         int num=a;
		 int b=1,N=0;		 
	    while(num!=0)
		{
			b=num%10;
			N=N*10+b;     
			num=num/10;                    
		}
		System.out.println(" "+N);
		
	}
}
	
	
/*
Enter Number =
1234
 4321  
 */