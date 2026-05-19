public class Factorial {

    // Recursive method
    static int factorial(int n) {

        // Base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int num = 5;

        // Calling factorial method
        int result = factorial(num);

        System.out.println("Factorial = " + result);
    }
}