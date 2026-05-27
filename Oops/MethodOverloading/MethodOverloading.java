class Addition {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Addition a1 = new Addition();

        a1.add(10, 20);

        a1.add(10, 20, 30);
    }
}