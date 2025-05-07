package Lesson_26.src;

import Lesson_26.src.Employee.Employee;

public class EmployeeChain implements TaskHandler {

    private final TaskHandler handlerFirst;
    private final TaskHandler handlerSecond;

    public EmployeeChain(TaskHandler handlerFirst, TaskHandler handlerSecond) {
        this.handlerFirst = handlerFirst;
        this.handlerSecond = handlerSecond;
    }

    public boolean doTask(Task task) {
        boolean result = false;
        result = handlerFirst.doTask(task);
        if(!result)
            result = handlerSecond.doTask(task);
        return result;
    }

}
