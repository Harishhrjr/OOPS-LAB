abstract class Employee {
    String name;
    int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double annualSalary;
    
    public FullTimeEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }
    

    double calculateSalary() {
        return annualSalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;
    
    public PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
    
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class sal {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 101, 60000);
        Employee partTime = new PartTimeEmployee("Bob", 102, 20, 120);
        
        System.out.println(fullTime.name + "'s Salary: $" + fullTime.calculateSalary());
        System.out.println(partTime.name + "'s Salary: $" + partTime.calculateSalary());
    }
}
