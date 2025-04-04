class Student {
    private String name;
    private String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        setGpa(gpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA! It must be between 0.0 and 4.0.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Harish", "cse24163", 7.3);
        student1.displayStudentDetails();
        student1.setGpa(4.5);
    }
}
