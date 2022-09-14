import java.util.Scanner;
    class leapyr{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Year = ");
	 int y=sc.nextInt();
		
		if(y%400==0)
		{   
	        System.out.println(y+" is leap year  ");
		}
		     else if(y%100==0)
		    {   
	            System.out.println(y+" is not leap year  ");
		    }
		     else if(y%4==0)
			{   
         		System.out.println(y+" is leap year  ");
		    }
			 else
			 {
				  System.out.println(y+" is not leap year  ");
			 }
	}
	}