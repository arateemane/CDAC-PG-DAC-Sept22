import java.util.Scanner;
    class swap{
	 public static void main(String args[]){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number m = ");
	 int m=sc.nextInt();
	 System.out.println("Enter Number n = ");
	 int n=sc.nextInt();
	    {
	       n=m+n;
	       m=n-m;
	       n=n-m;
	    }
	     System.out.println("Enter Number m = "+m);
	     System.out.println("Enter Number n = "+n);
    }
}



/*
Enter Number m =
1
Enter Number n =
9
Enter Number m = 9
Enter Number n = 1  */
	 