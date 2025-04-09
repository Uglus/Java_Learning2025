package Lesson_23.hw.Employee;

public class Employee {

    private final String name;
    private final double salary;
    private final int yearsOfExperience;


    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    private String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Name: " + name +"\n" +
                "Level: " + getType() + "\n" +
                "Salary: " + salary + "\n" +
                "Experience: " + yearsOfExperience + " years.\n";
    }
}
