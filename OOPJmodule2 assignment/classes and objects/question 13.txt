import java.util.Scanner;

class addition
{
    int num1;
    int num2;
    addition(int n1,int n2)
    {
        this.num1= n1;
        this.num2=n2;
    }

    void calculation()
    {
        int result = num1+num2;
        System.out.println("the sum of "+num1 +" and "+num2+" is "+result);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter the first number ");
        num1 = sc.nextInt();
        System.out.println("enter the second number ");
        num2 = sc.nextInt();
        addition add = new addition(num1,num2);
        add.calculation();

    }
}