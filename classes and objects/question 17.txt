import java.io.*;
class demo
{
    int number;
   demo()
   {
       System.out.println("the default constructor");
   }
   demo(int x)
   {
       this();
       System.out.println(x);
   }
   demo(int x,int y)
   {
       this(x*y);
       System.out.println(x+y);
   }

    public static void main(String[] args) {
       demo obj= new demo(4,5);

    }
}