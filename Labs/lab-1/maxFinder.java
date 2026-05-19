import java.util.Scanner

public class maxFinder{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in)

        System.out.println("Enter your number");
        int num1 = scn.nextInt();

        System.out.println("Enter your number");
        int num2 = scn.nextInt();

        if(num1>num2){
            System.out.println("number 1 is maximum");
        }
        else
        {
            System.out.println("number 2 is maximum");
            
        }

        }
}