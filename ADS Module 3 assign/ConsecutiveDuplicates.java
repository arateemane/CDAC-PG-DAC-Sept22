/*Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S

Output Format :
Output string

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string

Sample Input 1 :
aabccba
Sample Output 1 :
abcba

Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
*/


import java.util.Scanner;
  
class  ConsecutiveDuplicates{
    
    static String removeDuplicates(String input)
    {
        if(input.length() <= 1)
            return input;
        if(input.charAt(0) == input.charAt(1))
            return removeDuplicates(input.substring(1));
        else
            return input.charAt(0)+ removeDuplicates(input.substring(1));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
        System.out.println(removeDuplicates(S1));
    }
}


/*

C:\CDAC\module 3\practise\assignment>java ConsecutiveDuplicates
aabccba
abcba

C:\CDAC\module 3\practise\assignment>java ConsecutiveDuplicates
xxxyyyzwwzzz
xyzwz

*/