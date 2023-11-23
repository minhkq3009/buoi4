package buoi4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test Student class
        Student student = new Student();
        student.inputInfo();
        student.displayInfo();
        System.out.println("Has Scholarship: " + student.hasScholarship());

        // Test Teacher class
        Teacher teacher = new Teacher();
        teacher.inputInfo();
        teacher.displayInfo();
    }
}

