 public class recursion10{
     static int count=0;
	 static void p(){
	 count++;
	 if(count<=10)
	{
	     System.out.println(" "+count);
		 p();
	}
	}
	public static void main(String args[]){
	p();
	}
	}
	
	
	
	
	
	/*
 1
 2
 3
 4
 5
 6
 7
 8
 9
 10  */