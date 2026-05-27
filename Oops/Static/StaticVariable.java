class Student {

    static String college = "Nirma University";
    String name;

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Yash");
        Student s2 = new Student("Amit");

        s1.display();
        s2.display();
    }
}