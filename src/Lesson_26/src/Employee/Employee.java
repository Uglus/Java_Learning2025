package Lesson_26.src.Employee;

import Lesson_26.src.Task;
import Lesson_26.src.TaskProgressCallback;

public abstract class Employee {
    private final String name;
    private final Task.Status responsibleForTaskStatus;
    private final TaskProgressCallback callback;


    protected Employee(String name, Task.Status responsibleForTaskStatus, TaskProgressCallback callback) {
        this.name = name;
        this.responsibleForTaskStatus = responsibleForTaskStatus;
        this.callback = callback;
    }

    public void doTask(Task task){
        System.out.println(getClass().getSimpleName() + " " + name +
                " started working for task: " + getDetailsAboutProcess(task));
        System.out.println(getClass().getSimpleName() + " " + name +
                " working for task: " + getDetailsAboutProcess(task) + " ... ");
        callback.updateTask(task);
    }

    public Task.Status getResponsibleForTaskStatus(){
        return responsibleForTaskStatus;
    }

    protected abstract Task getTaskWhenDone(Task task);
    protected String getDetailsAboutProcess(Task task) {
        return "Task has: "+task.toString();
    }
}
