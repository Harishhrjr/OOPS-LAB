class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {
    private String benefits;

    public FullTimeEmployee(String name, int id, double salary, String benefits) {
        super(name, id, salary);
        this.benefits = benefits;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Benefits: " + benefits);
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, double salary, double hourlyRate) {
        super(name, id, salary);
        this.hourlyRate = hourlyRate;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 101, 60000, "Health Insurance");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 102, 20000, 25.5);
        fullTimeEmployee.displayInfo();
        System.out.println();
        partTimeEmployee.displayInfo();
    }
}
