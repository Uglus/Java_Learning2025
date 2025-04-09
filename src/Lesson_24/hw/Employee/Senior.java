package Lesson_24.hw.Employee;

public class Senior extends Employee {
    public Senior(String name, double salary, int yearsOfExperience) {
        super(name, salary, yearsOfExperience, EmployeeType.SENIOR);
    }
}
