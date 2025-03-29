interface Person {
    void displayInfo();
}

class Student implements Person {
    protected String name;
    protected int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }


    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}

class Teacher implements Person {
    protected String name;
    protected int employeeId;

    public Teacher(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

   
    public void displayInfo() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Classroom extends Student {
    private String className;

    public Classroom(String name, int studentId, String className) {
        super(name, studentId);
        this.className = className;
    }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Class Name: " + className);
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        Teacher teacher = new Teacher("Mr. Smith", 201);
        Classroom classroom = new Classroom("Bob", 102, "10th Grade");
        student.displayInfo();
        System.out.println();
        teacher.displayInfo();
        System.out.println();
        classroom.displayInfo();
    }
}
