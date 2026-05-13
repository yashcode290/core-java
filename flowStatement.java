public class FlowStatements {

    public static void main(String[] args) {

        // IF statement
        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // ELSE statement
        int number = 5;

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // SWITCH CASE statement
        int day = 2;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        // FOR loop
        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // WHILE loop
        System.out.println("While Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // DO-WHILE loop
        System.out.println("Do-While Loop:");

        int j = 1;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // BREAK statement
        System.out.println("Break Example:");

        for (int k = 1; k <= 10; k++) {

            if (k == 5) {
                break;
            }

            System.out.println(k);
        }

        // CONTINUE statement
        System.out.println("Continue Example:");

        for (int k = 1; k <= 5; k++) {

            if (k == 3) {
                continue;
            }

            System.out.println(k);
        }

        // RETURN statement
        greet();

        System.out.println("Main Method Ended");
    }

    // METHOD WITH RETURN
    public static void greet() {

        System.out.println("Hello from greet method");

        return;
    }
}