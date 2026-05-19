import java.util.Scanner;


public class operator{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = scn.nextInt();

        System.out.print("Enter Second Number: ");
        int b = scn.nextInt();

        System.out.println("Sum of 2 numbers is "+(a+b));
        System.out.println("Difference of 2 numbers is "+(a-b));
        System.out.println("Product of 2 numbers is "+(a*b));
        System.out.println("Quotient of 2 numbers is "+(a/b));

    }
}