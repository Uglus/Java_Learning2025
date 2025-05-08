package Lesson_26.src.Employee;

import Lesson_26.src.Task;
import Lesson_26.src.TaskHandler;
import Lesson_26.src.TaskProgressCallback;

public abstract class Employee implements TaskHandler {
    private final String name;
    private final Task.Status responsibleForTaskStatus;
    private final TaskProgressCallback callback;


    protected Employee(String name, Task.Status responsibleForTaskStatus, TaskProgressCallback callback) {
        this.name = name;
        this.responsibleForTaskStatus = responsibleForTaskStatus;
        this.callback = callback;
    }

    public boolean doTask(Task task){
        boolean canHandleTask = canHandleTask(task);
        if(canHandleTask) {
            System.out.println(getClass().getSimpleName() + " " + name +
                    " started working for task: " + getDetailsAboutProcess(task));
            System.out.println(getClass().getSimpleName() + " " + name +
                    " working for task: " + getDetailsAboutProcess(task) + " ... ");

            callback.updateTask(getTaskWhenDone(task));
            System.out.println(getClass().getSimpleName() + " " + name +
                    " finished working for task: " + getDetailsAboutProcess(task) + " !");
        }
        return canHandleTask;
    }

    public boolean canHandleTask(Task task) {
        return responsibleForTaskStatus == task.getStatus();
    }

    protected abstract Task getTaskWhenDone(Task task);
    protected String getDetailsAboutProcess(Task task) {
        return "Task has: "+task.toString();
    }
}
