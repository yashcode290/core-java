// Question:- Closest to n and Divisible by m
// Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, then output the one having maximum absolute value.

// Examples: 

// Input: n = 13, m = 4
// Output: 12
// Explanation: 12 is the closest to 13, divisible by 4.

// Input: n = -15, m = 6
// Output: -18
// Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.

import java.util.Scanner;

public class Closet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your number 1 :");
        int number = scanner.nextInt();
        System.out.println("enter your number 2 :");
        int number1 = scanner.nextInt();

        int div1 = number / number1;
        int mull = div1 * number1;

        
       
        if(number % number1 == 0)
        {
            System.out.println("number is divisable");
        }
        else
        {
                System.out.println("The closet number to "+ number + " is "+mull);
        }
    }
// }


// This will only solve the test case 1

// For solving both the cases we require this code
import java.util.Scanner;

public class Closet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        
        int distance = 0;
        while (true) {
            
            int optionA = n + distance;// n=15 d=0 15/4=remider=3 |n=15 d=1 so here A=15+1 =16 remder =0
            int optionB = n - distance;// n=15, d=0  |n=15 d=1  B=15-1 =14 r=2
            
            
            if (Math.abs(optionA) >= Math.abs(optionB)) {
                if (optionA % m == 0) { System.out.println("Output: " + optionA); break; }
                if (optionB % m == 0) { System.out.println("Output: " + optionB); break; }
            } else {
                if (optionB % m == 0) { System.out.println("Output: " + optionB); break; }
                if (optionA % m == 0) { System.out.println("Output: " + optionA); break; }
            }
            
            distance++;  
        }
    }
}