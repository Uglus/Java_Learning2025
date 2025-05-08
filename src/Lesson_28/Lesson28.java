package Lesson_28;

import Base.Lecture;
import Lesson_28.src.Employee.Designer;
import Lesson_28.src.Employee.Employee;
import Lesson_28.src.Employee.Programmer;
import Lesson_28.src.Employee.Tester;
import Lesson_28.src.TaskFactory;
import Lesson_28.src.TaskHandler;
import Lesson_28.src.TaskProgressCallback;
import Lesson_28.src.TaskProgressCallbackImp;

public class Lesson28 extends Lecture {

    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        TaskProgressCallback callback = new TaskProgressCallbackImp(factory);
        EmployeeChain chain = new EmployeeChain(
                new EmployeeChain(
                        new Designer("Designer_Name", callback),
                        new Programmer("Programmer_name",callback)
                    ),
                new Tester("Tester_Name",callback)
                );


        while (true) {
            if (!chain.doTask(factory.getTask()))
                break;
        }
    }
}
