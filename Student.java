package buoi4;

import java.util.Scanner;

class Student extends Person {
    private String studentCode;
    private double examScore;
    private String email;

    // Constructors
    public Student() {
    }

    public Student(String name, String gender, String birthDate, String address,
                   String studentCode, double examScore, String email) {
        super(name, gender, birthDate, address);
        this.studentCode = studentCode;
        this.examScore = examScore;
        this.email = email;
    }

    // Getter and Setter methods
    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public double getExamScore() {
        return examScore;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Override input information method
    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student code: ");
        this.studentCode = scanner.nextLine();
        System.out.print("Enter exam score: ");
        this.examScore = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter email: ");
        this.email = scanner.nextLine();
    }

    // Override display information method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student Code: " + studentCode);
        System.out.println("Exam Score: " + examScore);
        System.out.println("Email: " + email);
    }

    // Additional method to check if the student gets a scholarship
    public boolean hasScholarship() {
        return examScore > 8.0;
    }
}
