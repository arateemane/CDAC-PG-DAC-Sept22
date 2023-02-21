//13. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 

class SmallestNoWithoutSymbol
{
    public static void main(String args[])
    {
        int a=10,b=20,c=4,count=0;
       while(a==0||b==0||c==0)
       {
         a--;
         b--;
         c--;
         count++;
       }
       if(a==0)
       {
        System.out.print("a is smallest");
       }
        
       if(b==0)
       {
       System.out.print("b is smallest");
       }
       else
       {
         System.out.print("c is smallest");
       }
	}
}