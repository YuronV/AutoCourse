package employee;

public class Employee {
    private int id;
    public String surname;
    private double salary;

    public Employee(int id, String surname, double salary) {
        this.id = 4;
        this.surname = "Tom";
        this.salary = 2000;
    }

    Employee(int id, String surname) {
        this(5, "Alex", 5000);
    }

    private Employee(int id) {
        this(6, "Inna", 2500);
    }

    public void displayId() {
        System.out.println("ID: " + id);
    }

    public void displaySurname() {
        System.out.println("Surname: " + surname);
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}
