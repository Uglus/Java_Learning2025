package Lesson_28.src.Employee;

import Lesson_28.src.Task;
import Lesson_28.src.TaskHandler;
import Lesson_28.src.TaskProgressCallback;

public abstract class Employee implements TaskHandler {
    private final String name;
    private final Task.Status responsibleForTasksStatus;
    private final TaskProgressCallback callback;

    public Employee(String name, Task.Status responsibleForTasksStatus, TaskProgressCallback callback) {
        this.name = name;
        this.responsibleForTasksStatus = responsibleForTasksStatus;
        this.callback = callback;
    }

    @Override
    public boolean doTask(Task task) {
        boolean canHandleTask = canHandleTask(task);
        if(canHandleTask){
            System.out.println("working " + getClass().getSimpleName() +
                    " for task " + task.getDescription());
           // try{Thread.sleep(1000);}catch (Exception e){System.out.println("cant sleep");}
            System.out.println("finished " + getClass().getSimpleName() +
                    " for task " + task.getDescription());
            callback.updateTask(getTaskWhenDone(task));
        }

        return canHandleTask;

    }

    public boolean canHandleTask(Task task) {
        return task.getStatus() == responsibleForTasksStatus;
    }

    protected abstract Task getTaskWhenDone(Task task);

    protected String getDetailsAboutProcess(Task task){
        return "The task has this options: " + task.toString();
    }

}
