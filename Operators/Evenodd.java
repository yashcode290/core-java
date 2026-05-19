import java.util.*;

public class EvenOdd{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
    }
}