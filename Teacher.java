package buoi4;

import java.util.Scanner;

class Teacher extends Person {
    private String[] classesTaught;
    private double salary;
    private int numberOfSubjects;
    private String[] subjectsTaught;

    // Constructors
    public Teacher() {
    }

    public Teacher(String name, String gender, String birthDate, String address,
                   String[] classesTaught, double salary, int numberOfSubjects, String[] subjectsTaught) {
        super(name, gender, birthDate, address);
        this.classesTaught = classesTaught;
        this.salary = salary;
        this.numberOfSubjects = numberOfSubjects;
        this.subjectsTaught = subjectsTaught;
    }

    // Override input information method
    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of classes taught: ");
        int numClasses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        classesTaught = new String[numClasses];
        for (int i = 0; i < numClasses; i++) {
            System.out.print("Enter class " + (i + 1) + ": ");
            classesTaught[i] = scanner.nextLine();
        }

        System.out.print("Enter salary: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter number of subjects taught: ");
        this.numberOfSubjects = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        subjectsTaught = new String[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjectsTaught[i] = scanner.nextLine();
        }
    }

    // Override display information method
    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Classes Taught:");
        for (String aClass : classesTaught) {
            System.out.println("- " + aClass);
        }

        System.out.println("Salary: " + salary);
        System.out.println("Number of Subjects: " + numberOfSubjects);

        System.out.println("Subjects Taught:");
        for (String subject : subjectsTaught) {
            System.out.println("- " + subject);
        }
    }
}
