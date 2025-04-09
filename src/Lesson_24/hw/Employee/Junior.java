package Lesson_24.hw.Employee;

public class Junior extends Employee {
    public Junior(String name, double salary, int yearsOfExperience) {
        super(name, salary, yearsOfExperience, EmployeeType.JUNIOR);
    }
}
