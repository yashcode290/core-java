import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // Taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Checking leap year condition
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

            System.out.println("leap year");

        } else {

            System.out.println("not a leap year");
        }
    }
}