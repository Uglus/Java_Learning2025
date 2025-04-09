package Lesson_23.hw;

import Lesson_23.hw.Employee.Employee;
import Lesson_23.hw.Employee.Junior;
import Lesson_23.hw.Employee.Middle;
import Lesson_23.hw.Employee.Senior;

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

}
