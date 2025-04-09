package Lesson_24.hw.Employee;

public class Employee {

    private final String name;
    private final EmployeeType type;
    private final double salary;
    private final int yearsOfExperience;

    public Employee(String name, double salary, int yearsOfExperience,EmployeeType type) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.type = type;
    }

    public Employee(Employee oldEmployee, double bonusSalary) {
        this.name = oldEmployee.name;
        this.salary = oldEmployee.salary + bonusSalary;
        this.yearsOfExperience = oldEmployee.yearsOfExperience;
        this.type = oldEmployee.type;
    }

    public Employee(Employee oldEmployee, EmployeeType newType) {
        this.name = oldEmployee.name;
        this.salary = oldEmployee.salary;
        this.yearsOfExperience = oldEmployee.yearsOfExperience;
        this.type = newType;
    }

    public EmployeeType getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Name: " + name +"\n" +
                "Level: " + getType() + "\n" +
                "Salary: " + salary + "\n" +
                "Experience: " + yearsOfExperience + " years.\n";
    }
}
