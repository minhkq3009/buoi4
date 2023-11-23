package buoi4;

import java.util.Scanner;

class Person {
    private String name;
    private String gender;
    private String birthDate;
    private String address;

    // Constructors
    public Person() {
    }

    public Person(String name, String gender, String birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Input information method
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter gender: ");
        this.gender = scanner.nextLine();
        System.out.print("Enter birth date: ");
        this.birthDate = scanner.nextLine();
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
    }

    // Display information method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Address: " + address);
    }
}
