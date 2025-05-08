package Lesson_28;

import Lesson_28.src.Task;
import Lesson_28.src.TaskHandler;

public class EmployeeChain implements TaskHandler {
    private final TaskHandler firstHandler;
    private final TaskHandler secondHandler;

    public EmployeeChain(TaskHandler firstHandler, TaskHandler secondHandler) {
        this.firstHandler = firstHandler;
        this.secondHandler = secondHandler;
    }

    @Override
    public boolean doTask(Task task) {
        boolean canHandleTask = false;
        canHandleTask = firstHandler.doTask(task);
        if(!canHandleTask)
            canHandleTask = secondHandler.doTask(task);
        return canHandleTask;
    }
}
