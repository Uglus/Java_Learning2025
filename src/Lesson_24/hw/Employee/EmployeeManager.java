package Lesson_24.hw.Employee;

import Lesson_24.hw.EmployeeFactory;

public class EmployeeManager {

    private final Employee[] employees;

    public EmployeeManager(Employee[] employees) {
        this.employees = employees;
    }

    public void addSalaryToSpecificType(EmployeeType type, double bonusSalary){
        EmployeeFactory factory = new EmployeeFactory();
        for(int i = 0; i<employees.length;i++){
            if(employees[i].getType() == type){
                employees[i] = factory.addSalary(employees[i],bonusSalary);
            }
        }

    }
}
