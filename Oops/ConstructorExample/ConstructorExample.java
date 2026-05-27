class Car {

    String name;

    // Constructor
    Car() {

        name = "BMW";

        System.out.println("Constructor Called");
    }

    void display() {

        System.out.println("Car Name = " + name);
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        // Instantiation
        Car c1 = new Car();

        c1.display();
    }
}