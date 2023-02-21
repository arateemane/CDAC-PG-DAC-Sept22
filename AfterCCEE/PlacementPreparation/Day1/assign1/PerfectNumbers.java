//26. Write a Java Program to print Perfect Numbersbetween 1 to 1000.

public class PerfectNumbers
{
	public static void main(String[] args) 
	{
		int i, sum;
		System.out.print("Perfect numbers are: ");
		for (int n = 1; n <= 1000; n++) 
		{
		i = 1;
		sum = 0;
		while (i < n) {
			if (n % i == 0) {
			sum = sum + i;
			}
			i++;
		}
		if (sum == n) {
			System.out.print(n + " ");
	}
  }
 }
}

//Perfect numbers are: 6 28 496