package employee;

public class Main {
    public static void main(String[] args) {
        Employee publicEmployee = new Employee(1, "Public Employee", 50000.0);
        publicEmployee.displayId();
        publicEmployee.displaySurname();
        publicEmployee.displaySalary();

        Employee defaultEmployee = new Employee(2, "Default Employee", 2000);
        defaultEmployee.displayId();
        defaultEmployee.displaySurname();
        defaultEmployee.displaySalary();

        // can not create privateEmployee - compilation error shows
    }
}