import java.util.Scanner;
    class sumdgt{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number = ");
	 int a=sc.nextInt();
         int temp=a;
		 int sum=0;
		 int b=1;	 
	    while(temp>0)    //0    1      2
		{
			b=temp%10;          //3     5    1
                        sum=sum+b;			//3     8     9
			temp=temp/10;       //15       1       
		}
		    System.out.println("Sum of digits is "+sum);
		
	}
	}
	
	
	
	/*
Enter Number =
123
Sum of digits is 6
*/
	
	
