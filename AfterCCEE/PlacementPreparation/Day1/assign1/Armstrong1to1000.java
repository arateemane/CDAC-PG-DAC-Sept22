//24. Write a Java Program to print Armstrong Numbersbetween 1 to 1000.

public class Armstrong1to1000
{
    public static void main(String[] args) 
     {
        int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}

//Armstrong numbers from 1 to 1000:1 153 370 371 407

