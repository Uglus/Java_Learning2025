package Lesson_24.hw;

import Lesson_24.hw.Employee.Employee;
import Lesson_24.hw.Employee.Junior;
import Lesson_24.hw.Employee.Middle;
import Lesson_24.hw.Employee.Senior;

public class EmployeeFactory {

    public Employee create(String name, int experience, double salary){
        if(salary>=3000 && experience>=5) {
            return new Senior(name,salary,experience);
        } else if(salary>=1500 && experience>=2)
            return new Middle(name,salary, experience);
        else if(salary>=500 && experience>=0)
            return new Junior(name,salary,experience);
        else
            throw new IllegalArgumentException("Can`t create employee");
    }

    public Employee addSalary(Employee oldEmployee, double addSalary){
        //Мб перевірка якась повинна тут бути
        return new Employee(oldEmployee, addSalary);
    }

}
