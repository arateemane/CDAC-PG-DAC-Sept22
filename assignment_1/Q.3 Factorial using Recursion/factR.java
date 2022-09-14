import java.util.Scanner;
    class factR{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number = ");
	 int n=sc.nextInt();
	 int fact=1;	
     factR art = new factR();
		fact = art.fact(n);
		{
		 System.out.println("The factorial of given number is= "+fact);
		}
	}
	int fact(int x)      //4              ......3        ...2     
		{
		     if(x>0)     //4>0            .......3>0     ...2>0   
			{
			     return(x*fact(x-1));  //4*......3*      ...2*
		    }
			 else
		    {
				 return 1;
			}
		}
	 }
	 
	 
	 
	 /*
Enter Number =
4
The factorial of given number is= 24
  */