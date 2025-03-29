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

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Harish", 101, 100000.0, "cys");
        manager.displayInfo();
    }
}
