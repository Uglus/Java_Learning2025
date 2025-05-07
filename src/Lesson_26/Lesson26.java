package Lesson_26;

import Base.Lecture;
import Lesson_26.src.*;
import Lesson_26.src.Employee.Designer;
import Lesson_26.src.Employee.Programmer;
import Lesson_26.src.Employee.Tester;

public class Lesson26 extends Lecture {

    public static void main(String[] args) {
        //ЛЯМБДА. ПУНКТ 3 26 лекції
        TaskFactory taskFactory = new TaskFactory();
        TaskProgressCallback callback = new CallbackImpl(taskFactory);
        EmployeeChain chain = new EmployeeChain(
                new EmployeeChain(
                        new Designer("Designer_Name", callback),
                        new Programmer("Programmer_name",callback)
                ),
                new Tester("Tester_Name",callback)
        );


        while (true)
            if(!chain.doTask(taskFactory.getTask()))
                break;

    }

}
