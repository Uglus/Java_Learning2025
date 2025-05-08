package Lesson_28;

import Base.Lecture;
import Lesson_28.src.Employee.Programmer;
import Lesson_28.src.Employee.Designer;
import Lesson_28.src.Employee.Employee;
import Lesson_28.src.Employee.Tester;
import Lesson_28.src.TaskFactory;
import Lesson_28.src.TaskProgressCallback;
import Lesson_28.src.TaskProgressCallbackImp;

import java.util.ArrayList;
import java.util.List;

public class Lesson28 extends Lecture {

    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new TaskProgressCallbackImp(factory);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Designer("Designer_Name", callback));
        employees.add(new Programmer("Programmer_name",callback));
        employees.add(new Tester("Tester_name",callback));
        factory.addEmployees(employees);
        factory.start();
    }
}
