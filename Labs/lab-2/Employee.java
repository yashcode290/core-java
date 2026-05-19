class User {

    // Properties of User class
    int id;
    String name;

    // Parameterized constructor
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Employee class inherits User class
class Employee extends User {

    // Additional property
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {

        // Calling parent class constructor
        super(id, name);

        this.salary = salary;
    }

    // Method to calculate annual salary
    double calculateAnnualSalary() {

        return salary * 12;
    }

    // Main method
    public static void main(String[] args) {

        // Creating Employee object
        Employee e1 = new Employee(1, "john", 20000);

        // Calculating and printing annual salary
        System.out.println(e1.calculateAnnualSalary());
    }
}