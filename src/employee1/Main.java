package employee1;

import employee.Employee;

public class Main {
    public static void main(String[] args) {
        Employee publicEmployee = new Employee(1, "Public Employee", 50000.0);
        publicEmployee.displayId();
        publicEmployee.displaySurname();
        publicEmployee.displaySalary();

        // can not create defaultEmployee - compilation error shows(need to make default method public)

        // can not create privateEmployee - compilation error shows
    }
}
