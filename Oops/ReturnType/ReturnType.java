public class ReturnType {

    int add(int a, int b) {

        return a + b;
    }

    String name() {

        return "Yash";
    }

    public static void main(String[] args) {

        ReturnType r1 = new ReturnType();

        int sum = r1.add(10, 20);

        String n = r1.name();

        System.out.println("Sum = " + sum);

        System.out.println("Name = " + n);
    }
}