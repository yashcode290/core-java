class Car {

    String name;
    int price;

    // 1. Default constructor
    Car() {
        name = "Unknown";
        price = 0;
        System.out.println("Default Constructor Called");
    }

    // 2. Constructor with 1 parameter
    Car(String n) {
        name = n;
        price = 100000;
        System.out.println("Constructor with 1 parameter Called");
    }

    // 3. Constructor with 2 parameters
    Car(String n, int p) {
        name = n;
        price = p;
        System.out.println("Constructor with 2 parameters Called");
    }

    void display() {
        System.out.println("Car Name = " + name);
        System.out.println("Price = " + price);
    }
}

public class OverloadedConstructors {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.display();

        System.out.println("-----");

        Car c2 = new Car("BMW");
        c2.display();

        System.out.println("-----");

        Car c3 = new Car("Audi", 500000);
        c3.display();
    }
}