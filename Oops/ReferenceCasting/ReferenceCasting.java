class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class ReferenceCasting {

    public static void main(String[] args) {

        // Upcasting
        Animal a = new Dog();

        a.sound();

        // Downcasting
        Dog d = (Dog) a;

        d.bark();
    }
}