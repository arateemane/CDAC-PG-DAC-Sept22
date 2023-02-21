
import java.util.Scanner;
public class LCMWithPrimeFactors {
    // calculate greater number
    public static int largerNum(int n1, int n2) {
        return (n1>n2?n1:n2);
    }
   //returns LCM of two numbers
    public static int getLcm(int n1, int n2, int lcm) {
        if (n1 == 1 && n2 == 1) {
            return lcm;
        }
        int ans = 1;
        // iterating and considering prime factors
        for (int i = 2; i <= largerNum(n1, n2); i++) {
            if (n1 % i == 0 || n2 % i == 0) {
                if (n1 % i == 0) {
                    n1 = n1 / i;
                }
                if (n2 % i == 0) {
                    n2 = n2 / i;
                }
               
                ans = getLcm(n1, n2, lcm * i);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Number a = ");
	     int a=sc.nextInt();
	     System.out.println("Enter Number b = ");
	     int b=sc.nextInt();
       
        int lcm = getLcm(a, b, 1); // calling getLcm method
        System.out.println("The LCM is " + lcm); // printing result
	}
}


/*
Enter Number a =
4
Enter Number b =
2
The LCM is 4

E:\Desktop\after ccee\assign1>java LCMWithPrimeFactors
Enter Number a =
56
Enter Number b =
45
The LCM is 2520

E:\Desktop\after ccee\assign1>java LCMWithPrimeFactors
Enter Number a =
40
Enter Number b =
16
The LCM is 80
*/