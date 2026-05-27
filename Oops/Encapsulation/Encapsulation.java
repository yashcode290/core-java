class Student {

    // private variables
    private String name;
    private int age;

    // setter method
    public void setData(String n, int a) {
        name = n;
        age = a;
    }

    // getter method
    public void getData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setData("Yash", 20);

        s1.getData();
    }
}