package Lesson_24;

import Base.Lecture;
import Lesson_24.hw.Employee.Employee;
import Lesson_24.hw.Employee.EmployeeManager;
import Lesson_24.hw.Employee.EmployeeType;
import Lesson_24.hw.EmployeeFactory;

public class Lesson24 extends Lecture {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee[] employees = new Employee[]{
                employeeFactory.create("Name1",6,5500),
                employeeFactory.create("Name2",4,4000),
                employeeFactory.create("Name3",2,2500),
                employeeFactory.create("Name4",1,1000)
        };

        EmployeeManager manager = new EmployeeManager(employees);
        manager.addSalaryToSpecificType(EmployeeType.MIDDLE, 200);
        manager.addSalaryToSpecificType(EmployeeType.SENIOR, 300);

        print(employees);
    }

    private static void print(Employee... employees){
        for(Employee employee:employees){
            print(employee);
        }
    }

}
