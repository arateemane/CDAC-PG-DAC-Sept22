import java.util.Scanner;
    class dgt{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number = ");
	 int a=sc.nextInt();
         int temp=a;
		 int b=1;
		 int count=1;
        while(temp>0)         //153....15....1
		{
			count++;           //1.....2....3
			temp = temp/10;      //15....1....0
		}  
		  temp=a;		 
	    for(int i=count;i>1;i--)
		{
			b=temp%10;                      
			System.out.println(" "+b);     
			temp=temp/10;                    
		    count--;
		}
	}
	}
	
	
	
	/*
456321
 1
 2
 3
 6
 5
 4
  */