class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    Engine e;

    Car(Engine e) {
        this.e = e;
    }

    void startCar() {
        e.start();
    }
}

public class Coupling {

    public static void main(String[] args) {

        Engine eng = new Engine();
        Car c1 = new Car(eng);

        c1.startCar();
    }
}